package br.co.jorgereidinaldo.juno.app;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import br.com.jorgereidinaldo.juno.classes.BilletDetails;
import br.com.jorgereidinaldo.juno.classes.Charge;
import br.com.jorgereidinaldo.juno.classes.Charges;
import br.com.jorgereidinaldo.juno.classes.Data;
import br.com.jorgereidinaldo.juno.classes.Payment;
import br.com.jorgereidinaldo.juno.classes.Payments;
import br.com.jorgereidinaldo.juno.classes.Result;

public class Xml {

	public static void main(String[] args) throws FileNotFoundException {
	//	lerXML();
	//gravaXml();
			
		
	}	
	private static Result lerXML(String caminhoXML) throws FileNotFoundException {
		XStream xstream = new XStream(new DomDriver());
		
		if(!new File(caminhoXML).exists()) {
			   // Crio arquivo
			}
		
		 FileInputStream input = new FileInputStream(new File("C:\\juno.xml"));
		xstream.alias("result", Result.class);
		xstream.alias("data", Data.class);
		 xstream.alias("charges", Charges.class);
		 xstream.alias("charge", Charge.class);
	      
		 xstream.addImplicitCollection(Charges.class, "charge", Charge.class);
		 xstream.alias("billetDetails", BilletDetails.class);
		 xstream.alias("payments", Payments.class);
		 xstream.alias("payment", Payment.class);
		
		// BufferedReader input = new BufferedReader(new FileReader("c:/teste.xml"));
		
		//File input = new File("c://teste.xml");
		//File fXmlFile = new File("c:/juno.xml");
		//FileInputStream fis = new FileInputStream(fXmlFile);
		/** Fazendo o cast para o tipo de objeto Pessoa **/
		//System.out.println(fis);
		 System.out.println(input);
		Result xml1 = (Result) xstream.fromXML(input);
		//System.out.println(input);

		/** Imprimindo o resultado no console **/
		System.out.println("Nome  :" + xml1.getData().getCharges().getCharge().get(0).getDueDate());
		System.out.println("Valor Pago  :" + xml1.getData().getCharges().getCharge().get(0).getPayments().getPayment().getAmount());
		//System.out.println("Nome  :" + xml1.getData().getCharges().getCharge().get(0).getBilletDetails().get(0).getBarcodeNumber());
		//System.out.println("Idade :" + xml1.getIdade());
return xml1;



		}
	
	
	/*
	private static String  gravaXml() {
		XStream xstream = new XStream(new DomDriver());
		//O código abaixo é opcional
		//xstream.alias("pessoa", Pessoa.class);
		//xstream.alias("telefone", Fone.class);
		//Pessoa joao = new Pessoa("João", "da Silva");
		//joao.setFone(new Fone(1,"1234-456"));
		//joao.setCelular(new Fone(2,"9999-9999"));
		Result r =new Result();
		Data data=new Data();
		Charges charges=new Charges();
		ArrayList<Charge> charge=new ArrayList<Charge>();
		Charge charge1=new Charge();
		ArrayList<BilletDetails> billetDetails=new ArrayList<BilletDetails>();
		Payment pay = new Payment();
		xstream.alias("result", Result.class);
		xstream.alias("data", Data.class);
		 xstream.alias("charges", Charges.class);
		 xstream.alias("charge", Charge.class);
	      
		 xstream.addImplicitCollection(Charges.class, "charge", Charge.class);
		 xstream.alias("billetDetails", BilletDetails.class);
		
		xstream.alias("payments", Payments.class);
		
		
		Charge a=new Charge();
	a.setCode("1234568");
		a.setDueDate("10-05-2020");
		a.setPayNumber("BOLETO PAGO");
		charge.add(a);
		
		Charge n=new Charge();
		n.setCode("123456");
		n.setDueDate("10-05-2020");
		n.setPayNumber("BOLETO PAGO");
		charge.add(n);
		
		Charge b=new Charge();
		b.setCode("123456");
		b.setDueDate("10-05-2020");
		b.setPayNumber("BOLETO PAGO");
		charge.add(b);
		
		BilletDetails bili=new BilletDetails(); 
		bili.setBankAccount("0655/46480-8");
		bili.setOurNumber("176/70018821-3");
		bili.setBarcodeNumber("34191825400000012751767001882130655464808000");
		bili.setPortfolio("176");
		billetDetails.add(bili);
		
		BilletDetails bil=new BilletDetails(); 
		bil.setBankAccount("0655/46480-8");
		bil.setOurNumber("176/70018821-3");
		bil.setBarcodeNumber("34191825400000012751767001882130655464808000");
		bil.setPortfolio("176");
		billetDetails.add(bil);
		
		
		pay.setId("48836");
		pay.setAmount("50,00");
		pay.setDate("10-05-2020");
		pay.setFee("3.90");
		pay.setType("BOLETO");
		pay.setStatus("CONFIRMED");
		
		r.setData(data);
		r.getData().setCharges(charges);
		r.getData().getCharges().setCharge(charge);
		 r.getData().getCharges().getCharge().get(0).setBilletDetails(bili);
		 r.getData().getCharges().getCharge().get(1).setBilletDetails(bil);
		//r.getData().getCharges().getCharge().setPaymentsPay(pay);
		String xml = xstream.toXML(r);
		System.out.println(xml);
		return xml;
	}
	
	*/
}

