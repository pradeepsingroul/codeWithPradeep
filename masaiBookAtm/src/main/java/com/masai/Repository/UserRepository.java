package com.masai.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.masai.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	
	public Optional<User> findByEmail(String email);
	

	@Query("select new com.masai.Model.User(u) from User u order by :field :order")
	public List<User> getSortedList(@Param("field") String field,@Param("order") String order) ;
	
	
	@Query("DECLARE @PageNumber AS INT DECLARE @RowsOfPage AS INT SET @PageNumber=:page SET @RowsOfPage=:nuOfRwo SELECT  new com.masai.Model.User(u) FROM User FETCH NEXT @RowsOfPage ROWS ONLY")
	public List<User> getSpecificPages(@Param("page") Integer page,@Param("nuOfRwo") Integer nuOfRwo);

 
	@Query("DECLARE @PageNumber AS INT DECLARE @RowsOfPage AS INT SET @PageNumber=:page SET @RowsOfPage=:nuOfRwo SELECT  new com.masai.Model.User(u) FROM User ORDER BY :field :order FETCH NEXT @RowsOfPage ROWS ONLY")
	public List<User> getSortedSpecificPages(@Param("page") Integer page,@Param("nuOfRwo") Integer nuOfRwo,@Param("field") String field,@Param("order") String order);
	



}
