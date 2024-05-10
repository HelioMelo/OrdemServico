package br.com.servico.domain.technician;

import javax.xml.crypto.Data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class technician {

	
	private String id;
	
	
	private String name;
	
	
	private String email;
	
	private String photo;
	
	private String office;
	
	private String contact;
	
	private String cep;
	
	private String Street;
	
	private int numberHouse;
	
	private String state;
	
	private String Complement;
	
	private Enum Status;
	
	private Data CreateAt;
	
	private Data UpdateAt;
	
	
	
	
	
	
	
}
