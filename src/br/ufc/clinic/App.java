package br.ufc.clinic;

import br.ufc.clinic.repository.RepositoryManage;


public class App {

	public static void main(String[] args) {
		RepositoryManage<Object> r = new RepositoryManage<Object>();
		
		r.create();
	}

}
