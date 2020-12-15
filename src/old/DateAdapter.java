package old;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class DateAdapter extends XmlAdapter<String, LocalDate> {

	@Override
	public LocalDate unmarshal(String v) {
		return LocalDate.parse(v, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}

	@Override
	public String marshal(LocalDate date) {
	return date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}
}
