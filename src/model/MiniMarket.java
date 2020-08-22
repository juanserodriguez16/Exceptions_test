package model;
import java.util.*;
public class MiniMarket {
	private List<Document> List;
	private String name;
	private Document document;
	public MiniMarket(String name) {
		this.name = name;
		
		List = new ArrayList<Document>();
	}
	public void addDocument(Document document) {
		List.add(document);
	}
	public String infoclients() {
		String info = "Los documentos de los clientes que se ingresaron fueron:\n";
		for (int i = 0; i < List.size() ; i++) {
			info += "===================\n "+(i+1) + ")  El Documento es: " + List.get(i).getNumber()+ "|| El tipo de documento es: " + List.get(i).getType() + "\n";

	}
	return info;
	}

}
