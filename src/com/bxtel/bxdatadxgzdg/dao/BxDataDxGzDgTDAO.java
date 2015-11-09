package com.bxtel.bxdatadxgzdg.dao;


import com.bxtel.bxdatadxgzdg.*;

import com.bxtel.bxdatadxgzdg.model.*;
import dinamica.*;
import dinamica.*;
import dinamica.util.*;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.sql.DataSource;
import javax.annotation.Resource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import org.springframework.jdbc.core.*;
import org.springframework.stereotype.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.jdbc.support.JdbcUtils;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import oracle.sql.ROWID;



@Repository("BxDataDxGzDgTDAO")
public class BxDataDxGzDgTDAO
{

	@Resource
	public JdbcTemplate jdbcTemplate;

	@Resource
	public NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	private static final Log logger = LogFactory.getLog(BxDataDxGzDgTDAO.class);
	
	//@TriggersRemove(cacheName = "BxDataDxGzDgTDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public BxDataDxGzDgT add(BxDataDxGzDgT model) throws Exception  {
		String rowid=addThenReturnRowid(model);
		return  getBxDataDxGzDgTByRowId(rowid);
	}
	
	
	public String addThenReturnRowid(BxDataDxGzDgT model) throws Exception  {

		
		StringBuffer sql = new StringBuffer("insert into bx_data_dx_gz_dg_t("
				+" serviceid "
				+",commandid "
				+",sequenceno "
				+",submdn "
				+",username "
				+",pwd "
				+",starttime "
				+",validtime "
				+",factory "
				+",pkg "
				+",ppflag "
				+",ocs "
				+",ordno "
				+",reserved "
		
		+") values("
		
					+":serviceid"
					+",:commandid"
					+",:sequenceno"
					+",:submdn"
					+",:username"
					+",:pwd"
					+",:starttime"
					+",:validtime"
					+",:factory"
					+",:pkg"
					+",:ppflag"
					+",:ocs"
					+",:ordno"
					+",:reserved"
		  + ")" );
		  
		KeyHolder keyHolder = new GeneratedKeyHolder();
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		namedParameterJdbcTemplate.update(sql.toString(), sps,keyHolder);
		oracle.sql.ROWID id=(ROWID) keyHolder.getKeys().get("ROWID");
		return id.stringValue();
	}
	
	
	private BxDataDxGzDgT getBxDataDxGzDgTByRowId(String rowid) throws Exception {
		StringBuffer sql=new StringBuffer("select t.*,rowid from bx_data_dx_gz_dg_t t where rowid='"+rowid+"'");
		List<BxDataDxGzDgT> modellist = jdbcTemplate.query(sql.toString(),new BeanPropertyRowMapper(BxDataDxGzDgT.class));
		if(modellist!=null && modellist.size()==1)
		{
			return  modellist.get(0);
		}else{
			throw new Exception("rowid is wrong:"+rowid);
		}
	}
	
	
	//@TriggersRemove(cacheName = "BxDataDxGzDgTDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public int deleteByCoud(BxDataDxGzDgT model) {
		
		StringBuffer sql=new StringBuffer("delete from bx_data_dx_gz_dg_t where 1=1 ");
		if(model.getServiceid()!=null)
		{
			sql.append(" and serviceid=:serviceid ");
		}
		if(model.getCommandid()!=null)
		{
			sql.append(" and commandid=:commandid ");
		}
		if(model.getSequenceno()!=null)
		{
			sql.append(" and sequenceno=:sequenceno ");
		}
		if(model.getSubmdn()!=null)
		{
			sql.append(" and submdn=:submdn ");
		}
		if(model.getUsername()!=null)
		{
			sql.append(" and username=:username ");
		}
		if(model.getPwd()!=null)
		{
			sql.append(" and pwd=:pwd ");
		}
		if(model.getStarttime()!=null)
		{
			sql.append(" and starttime=:starttime ");
		}
		if(model.getValidtime()!=null)
		{
			sql.append(" and validtime=:validtime ");
		}
		if(model.getFactory()!=null)
		{
			sql.append(" and factory=:factory ");
		}
		if(model.getPkg()!=null)
		{
			sql.append(" and pkg=:pkg ");
		}
		if(model.getPpflag()!=null)
		{
			sql.append(" and ppflag=:ppflag ");
		}
		if(model.getOcs()!=null)
		{
			sql.append(" and ocs=:ocs ");
		}
		if(model.getOrdno()!=null)
		{
			sql.append(" and ordno=:ordno ");
		}
		if(model.getReserved()!=null)
		{
			sql.append(" and reserved=:reserved ");
		}
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		return namedParameterJdbcTemplate.update(sql.toString(), sps);
	}
	
	//@TriggersRemove(cacheName = "BxDataDxGzDgTDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public int deleteByExact(BxDataDxGzDgT model) throws Exception  {
		
		StringBuffer sql=new StringBuffer("delete from bx_data_dx_gz_dg_t where 1=1 ");
		sql.append(" and serviceid=:serviceid ");
		sql.append(" and commandid=:commandid ");
		sql.append(" and sequenceno=:sequenceno ");
		sql.append(" and submdn=:submdn ");
		sql.append(" and username=:username ");
		sql.append(" and pwd=:pwd ");
		sql.append(" and starttime=:starttime ");
		sql.append(" and validtime=:validtime ");
		sql.append(" and factory=:factory ");
		sql.append(" and pkg=:pkg ");
		sql.append(" and ppflag=:ppflag ");
		sql.append(" and ocs=:ocs ");
		sql.append(" and ordno=:ordno ");
		sql.append(" and reserved=:reserved ");
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		return namedParameterJdbcTemplate.update(sql.toString(), sps);
	}
	
	//@TriggersRemove(cacheName = "BxDataDxGzDgTDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public int deleteByRowId(String rowid)  throws Exception  {
		if(StringUtil.isEmptyOrWhitespace(rowid))
		{
			throw new Exception("rowid is null");
		}
		StringBuffer sql=new StringBuffer("delete from bx_data_dx_gz_dg_t where rowid='"+rowid+"'");
		return jdbcTemplate.update(sql.toString());
	}
	
	//@TriggersRemove(cacheName = "BxDataDxGzDgTDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public int updateExactByRowId(BxDataDxGzDgT model)  throws Exception  {
		if(StringUtil.isEmptyOrWhitespace(model.getRowid()))
		{
			throw new Exception("rowid is null");
		}
		StringBuffer sql=new StringBuffer("update  bx_data_dx_gz_dg_t set ");
					sql.append("serviceid=:serviceid , ");
					sql.append("commandid=:commandid , ");
					sql.append("sequenceno=:sequenceno , ");
					sql.append("submdn=:submdn , ");
					sql.append("username=:username , ");
					sql.append("pwd=:pwd , ");
					sql.append("starttime=:starttime , ");
					sql.append("validtime=:validtime , ");
					sql.append("factory=:factory , ");
					sql.append("pkg=:pkg , ");
					sql.append("ppflag=:ppflag , ");
					sql.append("ocs=:ocs , ");
					sql.append("ordno=:ordno , ");
					sql.append("reserved=:reserved ");
		sql=new StringBuffer(StringUtil.removeLastWith(sql.toString(),","));
		sql.append(" where rowid='"+model.getRowid()+"'");
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		return namedParameterJdbcTemplate.update(sql.toString(), sps);
	}
	
	//@TriggersRemove(cacheName = "BxDataDxGzDgTDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public int updateCoudByRowId(BxDataDxGzDgT model)  throws Exception  {
		if(StringUtil.isEmptyOrWhitespace(model.getRowid()))
		{
			throw new Exception("rowid is null");
		}
		StringBuffer sql=new StringBuffer("update  bx_data_dx_gz_dg_t set ");
					if(model.getServiceid()!=null)
					{
						sql.append("serviceid=:serviceid  ,");
					}
					if(model.getCommandid()!=null)
					{
						sql.append("commandid=:commandid  ,");
					}
					if(model.getSequenceno()!=null)
					{
						sql.append("sequenceno=:sequenceno  ,");
					}
					if(model.getSubmdn()!=null)
					{
						sql.append("submdn=:submdn  ,");
					}
					if(model.getUsername()!=null)
					{
						sql.append("username=:username  ,");
					}
					if(model.getPwd()!=null)
					{
						sql.append("pwd=:pwd  ,");
					}
					if(model.getStarttime()!=null)
					{
						sql.append("starttime=:starttime  ,");
					}
					if(model.getValidtime()!=null)
					{
						sql.append("validtime=:validtime  ,");
					}
					if(model.getFactory()!=null)
					{
						sql.append("factory=:factory  ,");
					}
					if(model.getPkg()!=null)
					{
						sql.append("pkg=:pkg  ,");
					}
					if(model.getPpflag()!=null)
					{
						sql.append("ppflag=:ppflag  ,");
					}
					if(model.getOcs()!=null)
					{
						sql.append("ocs=:ocs  ,");
					}
					if(model.getOrdno()!=null)
					{
						sql.append("ordno=:ordno  ,");
					}
					if(model.getReserved()!=null)
					{
						sql.append("reserved=:reserved  ,");
					}
		sql=new StringBuffer(StringUtil.removeLastWith(sql.toString(),","));
		sql.append(" where rowid='"+model.getRowid()+"'");
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		return namedParameterJdbcTemplate.update(sql.toString(), sps);
	}
	
	
	//@TriggersRemove(cacheName = "BxDataDxGzDgTDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public int updateByCoudAndWhere(BxDataDxGzDgT model,BxDataDxGzDgT wheremodel)  throws Exception  {
		
		boolean haspk=false;
		
		if(haspk=false)
		{
			throw new Exception("no primary key ");
		}
		
		StringBuffer sql=new StringBuffer("update  bx_data_dx_gz_dg_t set ");
					if(model.getServiceid()!=null)
					{
						sql.append("serviceid=:serviceid  ,");
					}
					if(model.getCommandid()!=null)
					{
						sql.append("commandid=:commandid  ,");
					}
					if(model.getSequenceno()!=null)
					{
						sql.append("sequenceno=:sequenceno  ,");
					}
					if(model.getSubmdn()!=null)
					{
						sql.append("submdn=:submdn  ,");
					}
					if(model.getUsername()!=null)
					{
						sql.append("username=:username  ,");
					}
					if(model.getPwd()!=null)
					{
						sql.append("pwd=:pwd  ,");
					}
					if(model.getStarttime()!=null)
					{
						sql.append("starttime=:starttime  ,");
					}
					if(model.getValidtime()!=null)
					{
						sql.append("validtime=:validtime  ,");
					}
					if(model.getFactory()!=null)
					{
						sql.append("factory=:factory  ,");
					}
					if(model.getPkg()!=null)
					{
						sql.append("pkg=:pkg  ,");
					}
					if(model.getPpflag()!=null)
					{
						sql.append("ppflag=:ppflag  ,");
					}
					if(model.getOcs()!=null)
					{
						sql.append("ocs=:ocs  ,");
					}
					if(model.getOrdno()!=null)
					{
						sql.append("ordno=:ordno  ,");
					}
					if(model.getReserved()!=null)
					{
						sql.append("reserved=:reserved  ,");
					}
		
		if(sql.lastIndexOf(",")==sql.length()-1)
		{
			sql=new StringBuffer(sql.substring(0,sql.length()-2));
		}
		
		
		StringBuffer where=new StringBuffer("");
					if(wheremodel.getServiceid()!=null)
					{
						where.append("and serviceid=:serviceid  ,");
					}
					if(wheremodel.getCommandid()!=null)
					{
						where.append("and commandid=:commandid  ,");
					}
					if(wheremodel.getSequenceno()!=null)
					{
						where.append("and sequenceno=:sequenceno  ,");
					}
					if(wheremodel.getSubmdn()!=null)
					{
						where.append("and submdn=:submdn  ,");
					}
					if(wheremodel.getUsername()!=null)
					{
						where.append("and username=:username  ,");
					}
					if(wheremodel.getPwd()!=null)
					{
						where.append("and pwd=:pwd  ,");
					}
					if(wheremodel.getStarttime()!=null)
					{
						where.append("and starttime=:starttime  ,");
					}
					if(wheremodel.getValidtime()!=null)
					{
						where.append("and validtime=:validtime  ,");
					}
					if(wheremodel.getFactory()!=null)
					{
						where.append("and factory=:factory  ,");
					}
					if(wheremodel.getPkg()!=null)
					{
						where.append("and pkg=:pkg  ,");
					}
					if(wheremodel.getPpflag()!=null)
					{
						where.append("and ppflag=:ppflag  ,");
					}
					if(wheremodel.getOcs()!=null)
					{
						where.append("and ocs=:ocs  ,");
					}
					if(wheremodel.getOrdno()!=null)
					{
						where.append("and ordno=:ordno  ,");
					}
					if(wheremodel.getReserved()!=null)
					{
						where.append("and reserved=:reserved  ,");
					}
		if(where.equals(""))
		{
			throw new Exception(" must have where condition"); 
		}
		sql=new StringBuffer(StringUtil.removeLastWith(sql.toString(),","));
		sql.append(" where 1=1  "+where.toString());
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		return namedParameterJdbcTemplate.update(sql.toString(), sps);
	}
	
	/*
	//@TriggersRemove(cacheName = "BxDataDxGzDgTDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public void batchInsert(List<BxDataDxGzDgT> list)  throws Exception{
		
		StringBuffer sql = new StringBuffer("insert into bx_data_dx_gz_dg_t("
				+" serviceid "
				+",commandid "
				+",sequenceno "
				+",submdn "
				+",username "
				+",pwd "
				+",starttime "
				+",validtime "
				+",factory "
				+",pkg "
				+",ppflag "
				+",ocs "
				+",ordno "
				+",reserved "
		
		+") values("
		
				+"?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
				+",?"
		  + ")" );
		
		
		PreparedStatement ps=null;
		Connection conn = null;
		try{
		
			  conn = DataSourceUtils.getConnection(jdbcTemplate.getDataSource());
			  ps= conn.prepareStatement(sql.toString()); 
			  for (int i = 0; i < list.size(); i++) {
					
					ps.setString(1, list.get(i).getServiceid());
					ps.setString(2, list.get(i).getCommandid());
					ps.setString(3, list.get(i).getSequenceno());
					ps.setString(4, list.get(i).getSubmdn());
					ps.setString(5, list.get(i).getUsername());
					ps.setString(6, list.get(i).getPwd());
					ps.setString(7, list.get(i).getStarttime());
					ps.setString(8, list.get(i).getValidtime());
					ps.setString(9, list.get(i).getFactory());
					ps.setString(10, list.get(i).getPkg());
					ps.setString(11, list.get(i).getPpflag());
					ps.setString(12, list.get(i).getOcs());
					ps.setString(13, list.get(i).getOrdno());
					ps.setString(14, list.get(i).getReserved());
					
					ps.addBatch();
					ps.clearParameters();
					if(i%500==0 || i==list.size()-1)
					{
						ps.executeBatch(); 
					}
			  }
			  ps.close();
		}catch (Exception ex) {
			 ex.printStackTrace(); 
		}finally{
			JdbcUtils.closeStatement(ps);  
			DataSourceUtils.releaseConnection(conn, jdbcTemplate.getDataSource());  
		}
		
	}
	
	//@TriggersRemove(cacheName = "BxDataDxGzDgTDAO", when = When.AFTER_METHOD_INVOCATION, removeAll = true)
	public void batchUpdate(List<BxDataDxGzDgT> list)  throws Exception{
		
		boolean haspk=false;
		
		if(haspk=false)
		{
			throw new Exception("no primary key ");
		}
		
		StringBuffer sql=new StringBuffer("update  bx_data_dx_gz_dg_t set ");
						sql.append("serviceid=? ,");
						sql.append("commandid=? ,");
						sql.append("sequenceno=? ,");
						sql.append("submdn=? ,");
						sql.append("username=? ,");
						sql.append("pwd=? ,");
						sql.append("starttime=? ,");
						sql.append("validtime=? ,");
						sql.append("factory=? ,");
						sql.append("pkg=? ,");
						sql.append("ppflag=? ,");
						sql.append("ocs=? ,");
						sql.append("ordno=? ,");
						sql.append("reserved=? ,");
		
		if(sql.lastIndexOf(",")==sql.length()-1)
		{
			sql=new StringBuffer(sql.substring(0,sql.length()-2));
		}
		
		StringBuffer where=new StringBuffer(" where 1=1 ");
		sql.append(where.toString());
		
		
		PreparedStatement ps=null;
		Connection conn = null;
		try{
		
			  conn = DataSourceUtils.getConnection(jdbcTemplate.getDataSource());
			  ps= conn.prepareStatement(sql.toString()); 
			  for (int i = 0; i < list.size(); i++) {
					
					ps.setString(1, list.get(i).getServiceid());
					ps.setString(2, list.get(i).getCommandid());
					ps.setString(3, list.get(i).getSequenceno());
					ps.setString(4, list.get(i).getSubmdn());
					ps.setString(5, list.get(i).getUsername());
					ps.setString(6, list.get(i).getPwd());
					ps.setString(7, list.get(i).getStarttime());
					ps.setString(8, list.get(i).getValidtime());
					ps.setString(9, list.get(i).getFactory());
					ps.setString(10, list.get(i).getPkg());
					ps.setString(11, list.get(i).getPpflag());
					ps.setString(12, list.get(i).getOcs());
					ps.setString(13, list.get(i).getOrdno());
					ps.setString(14, list.get(i).getReserved());
					
					ps.addBatch();
					ps.clearParameters();
					if(i%500==0 || i==list.size()-1)
					{
						ps.executeBatch(); 
					}
			  }
			  ps.close();
		}catch (Exception ex) {
			 ex.printStackTrace(); 
		}finally{
			JdbcUtils.closeStatement(ps);  
			DataSourceUtils.releaseConnection(conn, jdbcTemplate.getDataSource());  
		}
	}
	*/
	
	//@Cacheable(cacheName = "BxDataDxGzDgTDAO",keyGenerator = @KeyGenerator (name = "StringCacheKeyGenerator",properties = {@Property( name="useReflection", value="true" ), @Property( name="checkforCycles", value="true" ),@Property( name="includeMethod", value="true" ) }   ))
	public List<BxDataDxGzDgT> getBxDataDxGzDgTListByCoud(BxDataDxGzDgT model)  throws Exception  {
		StringBuffer sql=new StringBuffer("select t.*,rowid from bx_data_dx_gz_dg_t t where 1=1 ");
		if(model.getServiceid()!=null)
		{
			sql.append(" and serviceid=:serviceid ");
		}
		if(model.getCommandid()!=null)
		{
			sql.append(" and commandid=:commandid ");
		}
		if(model.getSequenceno()!=null)
		{
			sql.append(" and sequenceno=:sequenceno ");
		}
		if(model.getSubmdn()!=null)
		{
			sql.append(" and submdn=:submdn ");
		}
		if(model.getUsername()!=null)
		{
			sql.append(" and username=:username ");
		}
		if(model.getPwd()!=null)
		{
			sql.append(" and pwd=:pwd ");
		}
		if(model.getStarttime()!=null)
		{
			sql.append(" and starttime=:starttime ");
		}
		if(model.getValidtime()!=null)
		{
			sql.append(" and validtime=:validtime ");
		}
		if(model.getFactory()!=null)
		{
			sql.append(" and factory=:factory ");
		}
		if(model.getPkg()!=null)
		{
			sql.append(" and pkg=:pkg ");
		}
		if(model.getPpflag()!=null)
		{
			sql.append(" and ppflag=:ppflag ");
		}
		if(model.getOcs()!=null)
		{
			sql.append(" and ocs=:ocs ");
		}
		if(model.getOrdno()!=null)
		{
			sql.append(" and ordno=:ordno ");
		}
		if(model.getReserved()!=null)
		{
			sql.append(" and reserved=:reserved ");
		}
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		List<BxDataDxGzDgT> modellist = namedParameterJdbcTemplate.query(sql.toString(),sps,new BeanPropertyRowMapper(BxDataDxGzDgT.class));
		return modellist;
	}
	
	
	//@Cacheable(cacheName = "BxDataDxGzDgTDAO",keyGenerator = @KeyGenerator (name = "StringCacheKeyGenerator",properties = {@Property( name="useReflection", value="true" ), @Property( name="checkforCycles", value="true" ),@Property( name="includeMethod", value="true" ) }   ))
	public List<BxDataDxGzDgT> getBxDataDxGzDgTListByExact(BxDataDxGzDgT model)  throws Exception  {
		StringBuffer sql=new StringBuffer("select t.*,rowid from bx_data_dx_gz_dg_t t where 1=1 ");
			sql.append(" and serviceid=:serviceid ");
			sql.append(" and commandid=:commandid ");
			sql.append(" and sequenceno=:sequenceno ");
			sql.append(" and submdn=:submdn ");
			sql.append(" and username=:username ");
			sql.append(" and pwd=:pwd ");
			sql.append(" and starttime=:starttime ");
			sql.append(" and validtime=:validtime ");
			sql.append(" and factory=:factory ");
			sql.append(" and pkg=:pkg ");
			sql.append(" and ppflag=:ppflag ");
			sql.append(" and ocs=:ocs ");
			sql.append(" and ordno=:ordno ");
			sql.append(" and reserved=:reserved ");
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		List<BxDataDxGzDgT> modellist = namedParameterJdbcTemplate.query(sql.toString(),sps,new BeanPropertyRowMapper(BxDataDxGzDgT.class));
		return modellist;
	}
	
	
	
	//@Cacheable(cacheName = "BxDataDxGzDgTDAO",keyGenerator = @KeyGenerator (name = "StringCacheKeyGenerator",properties = {@Property( name="useReflection", value="true" ), @Property( name="checkforCycles", value="true" ),@Property( name="includeMethod", value="true" ) }   ))
	public List<Map<String, Object>> getListMapByCoud(BxDataDxGzDgT model)  throws Exception  {
		StringBuffer sql=new StringBuffer("select t.*,rowid from bx_data_dx_gz_dg_t  t where 1=1 ");
		if(model.getServiceid()!=null)
		{
			sql.append(" and serviceid=:serviceid ");
		}
		if(model.getCommandid()!=null)
		{
			sql.append(" and commandid=:commandid ");
		}
		if(model.getSequenceno()!=null)
		{
			sql.append(" and sequenceno=:sequenceno ");
		}
		if(model.getSubmdn()!=null)
		{
			sql.append(" and submdn=:submdn ");
		}
		if(model.getUsername()!=null)
		{
			sql.append(" and username=:username ");
		}
		if(model.getPwd()!=null)
		{
			sql.append(" and pwd=:pwd ");
		}
		if(model.getStarttime()!=null)
		{
			sql.append(" and starttime=:starttime ");
		}
		if(model.getValidtime()!=null)
		{
			sql.append(" and validtime=:validtime ");
		}
		if(model.getFactory()!=null)
		{
			sql.append(" and factory=:factory ");
		}
		if(model.getPkg()!=null)
		{
			sql.append(" and pkg=:pkg ");
		}
		if(model.getPpflag()!=null)
		{
			sql.append(" and ppflag=:ppflag ");
		}
		if(model.getOcs()!=null)
		{
			sql.append(" and ocs=:ocs ");
		}
		if(model.getOrdno()!=null)
		{
			sql.append(" and ordno=:ordno ");
		}
		if(model.getReserved()!=null)
		{
			sql.append(" and reserved=:reserved ");
		}
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model); 
		List<Map<String, Object>> modellist = namedParameterJdbcTemplate.queryForList(sql.toString(),sps);
		return modellist;
	}
	
	
	//@Cacheable(cacheName = "BxDataDxGzDgTDAO",keyGenerator = @KeyGenerator (name = "StringCacheKeyGenerator",properties = {@Property( name="useReflection", value="true" ), @Property( name="checkforCycles", value="true" ),@Property( name="includeMethod", value="true" ) }   ))
	public List<Map<String, Object>> getListMapByExact(BxDataDxGzDgT model)  throws Exception  {
		StringBuffer sql=new StringBuffer("select t.*,rowid from bx_data_dx_gz_dg_t t where 1=1 ");
			sql.append(" and serviceid=:serviceid ");
			sql.append(" and commandid=:commandid ");
			sql.append(" and sequenceno=:sequenceno ");
			sql.append(" and submdn=:submdn ");
			sql.append(" and username=:username ");
			sql.append(" and pwd=:pwd ");
			sql.append(" and starttime=:starttime ");
			sql.append(" and validtime=:validtime ");
			sql.append(" and factory=:factory ");
			sql.append(" and pkg=:pkg ");
			sql.append(" and ppflag=:ppflag ");
			sql.append(" and ocs=:ocs ");
			sql.append(" and ordno=:ordno ");
			sql.append(" and reserved=:reserved ");
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model); 
		List<Map<String, Object>> modellist = namedParameterJdbcTemplate.queryForList(sql.toString(),sps);
		return modellist;
	}
	
	
	//@Cacheable(cacheName = "BxDataDxGzDgTDAO",keyGenerator = @KeyGenerator (name = "StringCacheKeyGenerator",properties = {@Property( name="useReflection", value="true" ), @Property( name="checkforCycles", value="true" ),@Property( name="includeMethod", value="true" ) }   ))
	public List<BxDataDxGzDgT>  getPageListByCound(BxDataDxGzDgT model, int pageIndex,int rows)  throws Exception  {
		StringBuffer sql=new StringBuffer("select t.*,rowid from bx_data_dx_gz_dg_t t where 1=1 ");
		if(model.getServiceid()!=null)
		{
			sql.append(" and serviceid=:serviceid ");
		}
		if(model.getCommandid()!=null)
		{
			sql.append(" and commandid=:commandid ");
		}
		if(model.getSequenceno()!=null)
		{
			sql.append(" and sequenceno=:sequenceno ");
		}
		if(model.getSubmdn()!=null)
		{
			sql.append(" and submdn=:submdn ");
		}
		if(model.getUsername()!=null)
		{
			sql.append(" and username=:username ");
		}
		if(model.getPwd()!=null)
		{
			sql.append(" and pwd=:pwd ");
		}
		if(model.getStarttime()!=null)
		{
			sql.append(" and starttime=:starttime ");
		}
		if(model.getValidtime()!=null)
		{
			sql.append(" and validtime=:validtime ");
		}
		if(model.getFactory()!=null)
		{
			sql.append(" and factory=:factory ");
		}
		if(model.getPkg()!=null)
		{
			sql.append(" and pkg=:pkg ");
		}
		if(model.getPpflag()!=null)
		{
			sql.append(" and ppflag=:ppflag ");
		}
		if(model.getOcs()!=null)
		{
			sql.append(" and ocs=:ocs ");
		}
		if(model.getOrdno()!=null)
		{
			sql.append(" and ordno=:ordno ");
		}
		if(model.getReserved()!=null)
		{
			sql.append(" and reserved=:reserved ");
		}
		
		String sqlfinal=DBHelper.getPageSqlByPageIndex(sql.toString(),new Integer(pageIndex).toString(),new Integer(rows).toString());
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		
		List<BxDataDxGzDgT> modellist = namedParameterJdbcTemplate.query(sqlfinal,sps,new BeanPropertyRowMapper<BxDataDxGzDgT>(BxDataDxGzDgT.class));
		
		return modellist;
	}
	
	
	//@Cacheable(cacheName = "BxDataDxGzDgTDAO",keyGenerator = @KeyGenerator (name = "StringCacheKeyGenerator",properties = {@Property( name="useReflection", value="true" ), @Property( name="checkforCycles", value="true" ),@Property( name="includeMethod", value="true" ) }   ))
	public List<BxDataDxGzDgT>  getPageListByExact(BxDataDxGzDgT model, int pageIndex,int rows)   throws Exception {
		StringBuffer sql=new StringBuffer("select t.*,rowid from bx_data_dx_gz_dg_t t where 1=1 ");
			if(model.getServiceid()!=null)
			{
				sql.append(" and serviceid=:serviceid ");
			}
			if(model.getCommandid()!=null)
			{
				sql.append(" and commandid=:commandid ");
			}
			if(model.getSequenceno()!=null)
			{
				sql.append(" and sequenceno=:sequenceno ");
			}
			if(model.getSubmdn()!=null)
			{
				sql.append(" and submdn=:submdn ");
			}
			if(model.getUsername()!=null)
			{
				sql.append(" and username=:username ");
			}
			if(model.getPwd()!=null)
			{
				sql.append(" and pwd=:pwd ");
			}
			if(model.getStarttime()!=null)
			{
				sql.append(" and starttime=:starttime ");
			}
			if(model.getValidtime()!=null)
			{
				sql.append(" and validtime=:validtime ");
			}
			if(model.getFactory()!=null)
			{
				sql.append(" and factory=:factory ");
			}
			if(model.getPkg()!=null)
			{
				sql.append(" and pkg=:pkg ");
			}
			if(model.getPpflag()!=null)
			{
				sql.append(" and ppflag=:ppflag ");
			}
			if(model.getOcs()!=null)
			{
				sql.append(" and ocs=:ocs ");
			}
			if(model.getOrdno()!=null)
			{
				sql.append(" and ordno=:ordno ");
			}
			if(model.getReserved()!=null)
			{
				sql.append(" and reserved=:reserved ");
			}
		
		String sqlfinal=DBHelper.getPageSqlByPageIndex(sql.toString(),new Integer(pageIndex).toString(),new Integer(rows).toString());
		
		SqlParameterSource sps=new BeanPropertySqlParameterSource(model);
		
		List<BxDataDxGzDgT> modellist = namedParameterJdbcTemplate.query(sqlfinal,sps,new BeanPropertyRowMapper<BxDataDxGzDgT>(BxDataDxGzDgT.class));
		
		return modellist;
	}
	
	
	
	
	
	
	
	public List<BxDataDxGzDgT>  getPageListByBxDataDxGzDgTList(ArrayList<BxDataDxGzDgT> modellist, int pageIndex,int rows) throws Exception  {
		int startindex=(pageIndex-1)*rows+1;
		int endindex=pageIndex*rows;
		if(endindex>modellist.size()-1)
		{
			modellist.subList(startindex, endindex);
		}else{
			modellist.subList(startindex, modellist.size()-1);
		}
		return modellist;
	}
	
	
	public BxDataDxGzDgT getBxDataDxGzDgTByCoud(BxDataDxGzDgT model)  throws Exception  {
		List<BxDataDxGzDgT> modellist =getBxDataDxGzDgTListByCoud(model);
		if(modellist!=null&&modellist.size()==1)
		{
			return modellist.get(0);
		}else{
			return null;
		}
	}
	
	
	public BxDataDxGzDgT getBxDataDxGzDgTByExact(BxDataDxGzDgT model)  throws Exception  {
		List<BxDataDxGzDgT> modellist =getBxDataDxGzDgTListByExact(model);
		if(modellist!=null&&modellist.size()==1)
		{
			return modellist.get(0);
		}else{
			return null;
		}
	}
	
	public String  getSeqid() {
		String sql="select bx_data_dx_gz_dg_t_s.nextval as seqid from dual";
		
		List<Map<String, Object>> resultlist =null;
		try{
			
			resultlist = jdbcTemplate.queryForList(sql);
			if(resultlist.size()==1){
							Map<String, Object>  map = resultlist.get(0);
							BigDecimal seqid = (BigDecimal) map.get("SEQID");
							return seqid.toString();
			}
		}catch(Exception ex)
		{
			String createseq="create sequence bx_data_dx_gz_dg_t_s minvalue 1 maxvalue 999999999999999999999999 start with 1 increment by 1";
			jdbcTemplate.update(createseq);
			resultlist = jdbcTemplate.queryForList(sql);
			if(resultlist.size()==1){
						Map<String, Object>  map = resultlist.get(0);
						BigDecimal seqid = (BigDecimal) map.get("SEQID");
						return seqid.toString();
			}
		}
		return "";
	}
	
	
	
	public int deleteByRowid(String rowid)  throws Exception  {
		StringBuffer sql=new StringBuffer("delete  from  bx_data_dx_gz_dg_t  where rowid="+rowid);
		return jdbcTemplate.update(sql.toString());
	}
	
}