package com.pet.dao;

import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.pet.dto.PetDTO;

public class PetDAO {
	
	private static PetDAO instance;
	private static SqlSessionFactory factory;
	
	//Mybatis연결객체 생성--------------------------------------
	static {
			String resource="mybatis/mybatis-config.xml";
			System.out.println("펫 다오왔다 리소스: "+resource);
			Reader reader;
			try {
			reader=Resources.getResourceAsReader(resource);
			System.out.println("펫 다오왔다 리더: "+reader);
			
			factory=new SqlSessionFactoryBuilder().build(reader);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	//dao 객체를 한번만 생성해서 사용(singleton방식)-------------------- 
	public static PetDAO getInstance() {
		if(instance==null) {
			synchronized (PetDAO.class) {  //동기화 처리
				instance=new PetDAO();
			}
		}
		return instance;
	}
	//--------------------------------------------------------
	public List<PetDTO> getImageBoardList(Map<String, Object> map) {
		SqlSession session=factory.openSession();
		List<PetDTO> list=session.selectList("mybatis.ImageBoardMapper.getImageBoardList", map);
		session.close();
		return list;
	}
	
	
//	//---------------------------------------------------------
//	public int imageBoardInsert(PetDTO entity) {
//		SqlSession session=factory.openSession();
//		int n=0;
//		
//		try{
//			n=session.insert("mybatis.ImageBoardMapper.imageBoardInsert", entity);
//			if(n > 0)
//				session.commit();
//		}catch(Exception e){
//			session.rollback();
//		}finally{
//			session.close();
//		}
//		return n;
//	}
//	//---------------------------------------------------------
	public int getTotalArticle() {   //총 게시물의 갯수
		SqlSession session=factory.openSession();
		int n=session.selectOne("mybatis.ImageBoardMapper.getTotalArticle");
		session.close();
		return n;
	}
//	//--------------------------------------------------------
//	public List<PetDTO> getImagePath(List<Integer> list) {
//		SqlSession session=factory.openSession();
//		List<PetDTO> imgPathList
//		          =session.selectList("mybatis.ImageBoardMapper.getImagePath", list);
//		session.close();
//		return imgPathList;
//	}
//	//--------------------------------------------------------
//	public int imageBoardDelete(List<Integer> list) {
//		int n=0;
//		SqlSession session=factory.openSession();
//		
//		try {
//			n=session.delete("mybatis.ImageBoardMapper.imageBoardDelete",list);
//			if(n > 0)
//				session.commit();
//		}catch(Exception e) {
//			session.rollback();
//		}finally{
//			session.close();
//		}
//		return n;
//	}
	public PetDTO details(int seq) {
		// TODO Auto-generated method stub
		return null;
	}
}
