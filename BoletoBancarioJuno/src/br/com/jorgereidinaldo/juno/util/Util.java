package br.com.jorgereidinaldo.juno.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Util {
	public static Date dataFormatada(String dataFormat) throws ParseException {

		//SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd"); 
		//Date data = formato.parse("23/11/2015");
		java.sql.Date date = null;
        try {
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            date = new java.sql.Date( ((java.util.Date)formatter.parse(dataFormat)).getTime() );
        } catch (ParseException e) {            
            throw e;
        }
		
		
		System.out.println(date);
		return date;
	}
}
