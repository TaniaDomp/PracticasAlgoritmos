import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.*;
/*Tania Ariadna Dominguez Palma
 * 27/nov/2021
 * Permite que la interfaz del Hospital interactue y obtenga datos del usuario
 */
public class ControladorHospital extends VistaHospital{
	
	private static Hospital hos = new Hospital("Santa Rosa", "San Juan");
	
	public ControladorHospital(String titulo){
		super(titulo);
		altaPacBt.addActionListener(new EscuchadorAltaPac());
		altaMedBt.addActionListener(new EscuchadorAltaMed());
		bajaPacBt.addActionListener(new EscuchadorBajaBuscaPac());
		infoPacBt.addActionListener(new EscuchadorBajaBuscaPac());
		bajaMedBt.addActionListener(new EscuchadorBajaBuscaMed());
		infoMedBt.addActionListener(new EscuchadorBajaBuscaMed());
		numPacArBt.addActionListener(new EscuchadorInfoPac());
		numPacMedBt.addActionListener(new EscuchadorInfoMed());
		rangoEdBt.addActionListener(new EschuchadorCalRang());
		unMedBt.addActionListener(new EscuchadorUnMed());
		totInfoBt.addActionListener(new EscuchadorTotInfo());
		altaArchPBt.addActionListener(new EscuchadorAltaArchP());
		altaArchMBt.addActionListener(new EscuchadorAltaArchM());
	}
	
	private class EscuchadorAltaPac implements ActionListener{
		public void  actionPerformed(ActionEvent e) {
			String nombre, apellidoP, apellidoM, tipoDePaciente, diagnostico, edadStr;
			int edad;
			
			//Lectura de la informacion
			nombre = nomTxt.getText();
			apellidoP = apPTxt.getText();
			apellidoM = apMTxt.getText();
			//Verificacion del RadioButton seleccionado
			if(tipPac1Rb.isSelected()) {
				tipoDePaciente = "Con-confusion-mental";
			}
			else {
				if(tipPac2Rb.isSelected()) {
					tipoDePaciente = "anciano/infante";
				}
				else {
					if(tipPac3Rb.isSelected()) {
						tipoDePaciente = "otro";
					}
					else {
						tipoDePaciente = null;
					}
				}
			}
			diagnostico = diagTxt.getText();
			edadStr = edTxt.getText();
			edad = Integer.parseInt(edadStr);
			
			if(hos.altaPaciente(nombre, apellidoP, apellidoM, tipoDePaciente, diagnostico, edad)) {
				JOptionPane.showMessageDialog(null, "Alta exitosa", "Estado del alta", JOptionPane.INFORMATION_MESSAGE);
			}
			else {
				JOptionPane.showMessageDialog(null, "Error en el alta", "Estado del alta", JOptionPane.ERROR_MESSAGE);
			}
			limpiaAltaPac();
		}
	}
	
	private class EscuchadorAltaMed implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String claveUr, nombre, tipoMed, unidadesDeSuministroStr, tiempoDeSuministroHrsStr;
			int unidadesDeSuministro, tiempoDeSuministroHrs;
			
			//Lectura de datos y conversion a los tipos necesarios
			claveUr = clavTxt.getText();
			nombre = nomMedTxt.getText();
			unidadesDeSuministroStr = unSumTxt.getText();
			unidadesDeSuministro = Integer.parseInt(unidadesDeSuministroStr);
			tiempoDeSuministroHrsStr = tiemSumTxt.getText();
			tiempoDeSuministroHrs = Integer.parseInt(tiempoDeSuministroHrsStr);
			//Verificacion del RadioButton seleccionado
			if (tipMed1Rb.isSelected()) {
				tipoMed = "Generico";
			}
			else {
				if (tipMed2Rb.isSelected()) {
					tipoMed = "Patente";
				}
				else {
					tipoMed = null;
				}
			}
			if (hos.altaMedicamentoPac(claveUr, nombre, unidadesDeSuministro, tiempoDeSuministroHrs, tipoMed)) {
				JOptionPane.showMessageDialog(null, "Alta del medicamento exitosa", "Estado del alta medicamento", JOptionPane.INFORMATION_MESSAGE);
			}
			else {
				JOptionPane.showMessageDialog(null, "Error en el alta del medicamento", "Estado del alta del medicamento", JOptionPane.ERROR_MESSAGE);
			}
			limpiaAltaMed();
		}
	}
	
	private class EscuchadorBajaBuscaPac implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String clavUr, nomBt, infoPac;
			
			clavUr = clavITxt.getText();
			//Identificacion del boton oprimido
			nomBt = e.getActionCommand();
			if (nomBt.equals("Baja paciente")) {
				infoPac = hos.bajaPaciente(clavUr);
			}
			else {
				infoPac = hos.getUnPaciente(clavUr);
			}
			infoHosTxtA.setText(infoPac);
			limpiaBusqBaj();
		}
	}
	
	private class EscuchadorBajaBuscaMed implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String clavU, clavM, nomBt, infoMed;
			
			clavU = clavITxt.getText();
			clavM = clavMedITxt.getText();
			nomBt = e.getActionCommand();
			if(nomBt.equals("Baja medicamento")) {
				infoMed = hos.bajaMedicamentoPac(clavU, clavM);
			}
			else {
				infoMed = hos.getUnMedicamentoPac(clavU, clavM);
			}
			infoHosTxtA.setText(infoMed);
			limpiaBusqBaj();
		}
	}
	
	private class EscuchadorInfoPac implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String area, totPacStr;
			int totPac;
			
			//Verificacion del RadioButton seleccionado
			if(tipAr1Rb.isSelected()) {
				area = "ALTA";
			}
			else {
				if(tipAr2Rb.isSelected()) {
					area = "MEDIA";
				}
				else {
					if(tipAr3Rb.isSelected()) {
						area = "BAJA";
					}
					else {
						area = null;
					}
				}
			}
			totPac = hos.getNumPacArea(area);
			totPacStr = String.valueOf(totPac);
			infoHosTxtA.setText("Total de pacientes "+ area + ": " + totPacStr);
			limpiaInfoP();
		}
	}
	
	private class EscuchadorInfoMed implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String clavM, totPacStr;
			int totPac;
			
			clavM = clavMedITxt.getText();
			totPac = hos.cuantosUnMedicamento(clavM);
			totPacStr = String.valueOf(totPac);
			infoHosTxtA.setText("Total de pacientes del medicamento"+ clavM + ": " + totPacStr);
			limpiaBusqBaj();
		}
	}
	
	private class EschuchadorCalRang implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			int ed1, ed2, totPac;
			String ed1Str, ed2Str, totPacStr;
			
			ed1Str = ed1Txt.getText();
			ed1 = Integer.parseInt(ed1Str);
			ed2Str = ed2Txt.getText();
			ed2 = Integer.parseInt(ed2Str);
			totPac = hos.cuantosEnRangoEdad(ed1, ed2);
			totPacStr = String.valueOf(totPac);
			infoHosTxtA.setText("Total de pacientes: " + totPacStr);
			limpiaInfoP();
		}
	}
	
	private class EscuchadorUnMed implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String clavM, unMedStr;
			int unMed;
			
			clavM = clavMedITxt.getText();
			unMed = hos.unidadesDeUnMedicamento(clavM);
			unMedStr = String.valueOf(unMed);
			infoHosTxtA.setText("Unidades requeridas para " + clavM + ": "+ unMedStr);
			limpiaBusqBaj();
		}
	}
	
	private class EscuchadorTotInfo implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			infoHosTxtA.setText(hos.toString());
		}
	}
	
	private class EscuchadorAltaArchP implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			altaArchPac();
		}
	}
	
	private class EscuchadorAltaArchM implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			altaArchMed();
		}
	}
	
	
	//Metodos que sirven para realizar alta de informacion desde archivos
	public static void altaArchPac() {
		String nombreP, apellidoM, apellidoP, tipoPaciente, diagnostico;
		int edad;
		File ent = new File ("DatosPaciente.txt");
		
		try (Scanner lect = new Scanner(ent)){
			while(lect.hasNext()) {
				nombreP = lect.next();
				apellidoP = lect.next();
				apellidoM = lect.next();
				tipoPaciente = lect.next();
				diagnostico = lect.nextLine();
				diagnostico = lect.nextLine();
				edad = lect.nextInt();
				hos.altaPaciente(nombreP, apellidoP, apellidoM, tipoPaciente, diagnostico, edad);
			}
			lect.close();
		}
		catch(FileNotFoundException fnfe) {
			System.err.println("E R R O R" + fnfe);
			System.exit(-1);
		}
	}
	
	public static void altaArchMed() {
		String claveU, nombreM, tipoMed;
		int unidades, tiempo;
		File ent = new File ("DatosMedicamentos.txt");
		
		try (Scanner lect = new Scanner(ent)){
			while(lect.hasNext()) {
				claveU = lect.next();
				nombreM = lect.next();
				unidades = lect.nextInt();
				tiempo = lect.nextInt();
				tipoMed = lect.next();
				hos.altaMedicamentoPac(claveU, nombreM, unidades, tiempo, tipoMed);
			}
			lect.close();
		}
		catch(FileNotFoundException fnfe) {
			System.err.println("E R R O R" + fnfe);
			System.exit(-1);
		}
	}
	
	//Metodos que sirven para limpiar los campos de texto luego de realizar la operacion de un boton determinado
	private void limpiaAltaPac() {
		nomTxt.setText("");
		apPTxt.setText("");
		apMTxt.setText("");
		grupoTipPac.clearSelection();
		diagTxt.setText("");
		edTxt.setText("");
	}
	
	private void limpiaAltaMed() {
		clavTxt.setText("");
		nomMedTxt.setText("");
		unSumTxt.setText("");
		tiemSumTxt.setText("");
		grupoTipMed.clearSelection();
	}
	
	private void limpiaBusqBaj() {
		clavITxt.setText("");
		clavMedITxt.setText("");
	}
	
	private void limpiaInfoP() {
		grupoTipAr.clearSelection();
		ed1Txt.setText("");
		ed2Txt.setText("");
	}
	
	public static void main(String[] args) {
		ControladorHospital yo = new ControladorHospital("H O S P I T A L");
	}
}