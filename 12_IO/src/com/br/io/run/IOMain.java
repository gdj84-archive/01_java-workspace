package com.br.io.run;

import com.br.io.model.dao.AssistBufferedDao;
import com.br.io.model.dao.AssistObjectDao;
import com.br.io.model.dao.FileByteDao;
import com.br.io.model.dao.FileCharDao;

public class IOMain {

	public static void main(String[] args) {
		
		FileByteDao fbd = new FileByteDao();
		//fbd.fileSave();
		//fbd.fileRead();
		
		FileCharDao fcd = new FileCharDao();
		//fcd.fileSave();
		//fcd.fileRead();
		
		AssistBufferedDao abd = new AssistBufferedDao();
		//abd.fileSave();
		//abd.fileRead();
		
		AssistObjectDao aod = new AssistObjectDao();
		//aod.fileSave();
		aod.fileRead();
		
		
		
		
		
		
	}

}
