import javax.swing.*;
import java.awt.GridLayout;
import java.awt.*;
/*Tania Ariadna Dominguez Palma
 * 25/nov/2021
 * Dibuja una interfaz para interactuar con los usuarios del Hospital
 */
public class VistaHospital extends JFrame{
	private JLabel regisPacLb, nomLb, apPLb, apMLb, tipPLb, diagLb, edLb, regisMedLb, clavLb, nomMedLb, unSumLb, tiemSumLb, tipoMedLb, infoDatLb, clavILb, clavMedILb, areLb, ed1Lb, ed2Lb, bas1Lb, bas2Lb, bas3Lb, bas4Lb, bas5Lb, bas6Lb, bas7Lb, bas8Lb, bas9Lb; 
	protected JTextField nomTxt, apPTxt, apMTxt, diagTxt, edTxt, clavTxt, nomMedTxt, unSumTxt, tiemSumTxt, clavITxt, clavMedITxt, ed1Txt, ed2Txt;
	protected JRadioButton tipPac1Rb, tipPac2Rb, tipPac3Rb, tipMed1Rb, tipMed2Rb, tipAr1Rb, tipAr2Rb, tipAr3Rb;
	protected ButtonGroup grupoTipPac, grupoTipMed, grupoTipAr;
	protected JButton altaPacBt, altaMedBt, bajaPacBt, bajaMedBt, infoMedBt, infoPacBt, numPacArBt, numPacMedBt, rangoEdBt, unMedBt, totInfoBt, altaArchPBt, altaArchMBt;
	protected JTextArea infoHosTxtA;
	private JScrollPane barras;
	
	public VistaHospital(String titulo){
		super(titulo);
		
		regisPacLb = new JLabel("Registro para los pacientes");
		nomLb = new JLabel("Nombre");
		apPLb = new JLabel("Apellido paterno: ");
		apMLb = new JLabel("Apellido materno: ");
		tipPLb = new JLabel("Tipo de paciente: ");
		diagLb = new JLabel("Diagnostico: ");
		edLb = new JLabel("Edad: ");
		regisMedLb = new JLabel("Registro para medicamentos");
		clavLb = new JLabel("Clave usuario: ");
		nomMedLb = new JLabel("Nombre del medicamento: ");
		unSumLb = new JLabel("Unidades suministro: ");
		tiemSumLb = new JLabel("Tiempo de suministro (en horas): ");
		tipoMedLb = new JLabel("Tipo de medicamento: "); 
		infoDatLb = new JLabel("Informacion de los datos: ");
		clavILb = new JLabel("Clave usuario: ");
		clavMedILb = new JLabel("Clave del medicamento: ");
		areLb = new JLabel("Area de prioridad: ");
		ed1Lb = new JLabel("Rango de edad 1: ");
		ed2Lb = new JLabel("Rango de edad 2: ");
		bas1Lb = new JLabel("");
		bas2Lb = new JLabel("");
		bas3Lb = new JLabel("");
		bas4Lb = new JLabel("");
		bas5Lb = new JLabel("");
		bas6Lb = new JLabel("");
		bas7Lb = new JLabel("");
		bas8Lb = new JLabel("");
		bas9Lb = new JLabel("");
		tipPac1Rb = new JRadioButton("Con-confusion-mental");
		tipPac2Rb = new JRadioButton("anciano/infante");
		tipPac3Rb = new JRadioButton("otro");
		tipMed1Rb = new JRadioButton("Generico");
		tipMed2Rb = new JRadioButton("Patente");
		tipAr1Rb = new JRadioButton("ALTA");
		tipAr2Rb = new JRadioButton("MEDIA");
		tipAr3Rb = new JRadioButton("BAJA");
		grupoTipPac = new ButtonGroup();
		grupoTipMed = new ButtonGroup();
		grupoTipAr = new ButtonGroup();
		nomTxt = new JTextField(20);
		apPTxt = new JTextField(15);
		apMTxt = new JTextField(15);
		diagTxt = new JTextField(20);
		edTxt = new JTextField(3);
		clavTxt = new JTextField(18);
		nomMedTxt = new JTextField(20);
		unSumTxt = new JTextField(5);
		tiemSumTxt = new JTextField(5);
		clavITxt = new JTextField(18);
		clavMedITxt = new JTextField(20);
		ed1Txt = new JTextField(3);
		ed2Txt = new JTextField(3);
		infoHosTxtA = new JTextArea(20, 30);
		barras = new JScrollPane(infoHosTxtA);
		altaPacBt = new JButton("Alta paciente");
		altaMedBt = new JButton("Alta medicamento");
		bajaPacBt = new JButton("Baja paciente");
		bajaMedBt = new JButton("Baja medicamento");
		infoMedBt = new JButton("Medicamento de un paciente");
		infoPacBt = new JButton("Informacion de paciente");
		numPacArBt = new JButton("Pacientes de area");
		numPacMedBt = new JButton("Pacientes por medicamento");
		rangoEdBt = new JButton("Pacientes en rango de edad");
		unMedBt = new JButton("Unidades de un medicamento");
		totInfoBt = new JButton("Mostrar informacion registrada");
		altaArchPBt = new JButton("Alta archivo paciente");
		altaArchMBt = new JButton("Alta archivo medicamento");
		grupoTipPac.add(tipPac1Rb);
		grupoTipPac.add(tipPac2Rb);
		grupoTipPac.add(tipPac3Rb);
		grupoTipMed.add(tipMed1Rb);
		grupoTipMed.add(tipMed2Rb);
		grupoTipAr.add(tipAr1Rb);
		grupoTipAr.add(tipAr2Rb);
		grupoTipAr.add(tipAr3Rb);
		
		this.setLayout(new FlowLayout());
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(11,3));
		p1.add(regisPacLb);
		p1.add(bas1Lb);
		p1.add(nomLb);
		p1.add(nomTxt);
		p1.add(apPLb);
		p1.add(apPTxt);
		p1.add(apMLb);
		p1.add(apMTxt);
		p1.add(tipPLb);
		p1.add(bas2Lb);
		p1.add(tipPac1Rb);
		p1.add(tipPac2Rb);
		p1.add(tipPac3Rb);
		p1.add(bas3Lb);
		p1.add(diagLb);
		p1.add(diagTxt);
		p1.add(edLb);
		p1.add(edTxt);
		p1.add(altaPacBt);
		p1.add(altaArchPBt);
		this.add(p1);
		
		JPanel p2 = new JPanel();
		p2.add(barras);
		this.add(p2);
		
		JPanel p3 = new JPanel();
		p3.setLayout(new GridLayout(8,2));
		p3.add(regisMedLb);
		p3.add(bas4Lb);
		p3.add(clavLb);
		p3.add(clavTxt);
		p3.add(nomMedLb);
		p3.add(nomMedTxt);
		p3.add(unSumLb);
		p3.add(unSumTxt);
		p3.add(tiemSumLb);
		p3.add(tiemSumTxt);
		p3.add(tipoMedLb);
		p3.add(bas5Lb);
		p3.add(tipMed1Rb);
		p3.add(tipMed2Rb);
		p3.add(altaMedBt);
		p3.add(altaArchMBt);
		this.add(p3);
		
		JPanel p4 = new JPanel();
		p4.setLayout(new GridLayout(4,2));
		p4.add(infoDatLb);
		p4.add(bas6Lb);
		p4.add(clavILb);
		p4.add(clavITxt);
		p4.add(clavMedILb);
		p4.add(clavMedITxt);
		p4.add(totInfoBt);
		p4.add(bas7Lb);
		this.add(p4);
		
		JPanel p5 = new JPanel();
		p5.setLayout(new GridLayout(4,2));
		p5.add(bajaPacBt);
		p5.add(infoPacBt);
		p5.add(bajaMedBt);
		p5.add(infoMedBt);
		p5.add(numPacArBt);
		p5.add(numPacMedBt);
		p5.add(rangoEdBt);
		p5.add(unMedBt);
		this.add(p5);
		
		JPanel p6 = new JPanel();
		p6.setLayout(new GridLayout(5,2));
		p6.add(areLb);
		p6.add(bas8Lb);
		p6.add(tipAr1Rb);
		p6.add(tipAr2Rb);
		p6.add(tipAr3Rb);
		p6.add(bas9Lb);
		p6.add(ed1Lb);
		p6.add(ed1Txt);
		p6.add(ed2Lb);
		p6.add(ed2Txt);
		this.add(p6);
		
		this.setBounds(20, 20, 1200, 550);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	/*public static void main(String[] args) {
		VistaHospital yo = new VistaHospital("P R U E B A");
	}*/

}
