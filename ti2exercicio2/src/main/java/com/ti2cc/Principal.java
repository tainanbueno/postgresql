package com.ti2cc;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DAO dao = new DAO();
		dao.conectar();
		
		int opc = 0;
		int cd = 10, cdp = 0;
		String nm="", tf="", em="", sn="";
		
		System.out.println("1- Listar \n 2- Inserir \n 3- Excluir \n 4- Atualizar \n 5- Sair");
		System.out.println("\nDigite uma opção:");
		opc = sc.nextInt();

		while(opc != 5) {
			if(opc == 1) {
				usuarios = dao.getUsuarios();
				System.out.println("==== Mostrar usuários === ");	
				for(int i = 0; i < usuarios.length; i++) {
					System.out.println(usuarios[i].toString());
				}
				
			} else if(opc == 2) {
				cd++;
				System.out.println("Digite seu nome:");
				nm = sc.nextLine();
				System.out.println("Digite seu telefone:");
				tf = sc.nextLine();
				System.out.println("Digite seu e-mail:");
				em = sc.nextLine();
				System.out.println("Digite sua senha:");
				sn = sc.nextLine();
				
				Usuario usuarios = new Usuario(cd, nm, tf, em, sn);
				
				if(dao.inserirUsuario(usuarios) == true) {
					System.out.println("Inserção com sucesso -> " + usuarios.toString());
				}
				
			} else if(opc == 3) {
				System.out.println("Digite seu código:");
				cdp = sc.nextInt();
				dao.excluirUsuario(cdp);
				
			} else if (opc == 4) {
				System.out.println("Digite seu código:");
				cdp = sc.nextInt();
				System.out.println("Digite seu nome:");
				nm = sc.nextLine();
				System.out.println("Digite seu telefone:");
				tf = sc.nextLine();
				System.out.println("Digite seu e-mail:");
				em = sc.nextLine();
				System.out.println("Digite sua senha:");
				sn = sc.nextLine();
				
				Usuario usuarios = new Usuario(cdp, nm, tf, em, sn);
				
				dao.atualizarUsuario(usuarios);
			
			} else {
				System.out.println("Opção inválida!");
			}
		}
		
		sc.close();
		dao.close();
	}
}
