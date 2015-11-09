package com.bxtel.bxdatadxgzdg.bo;
import com.bxtel.bxdatadxgzdg.model.*;
import com.bxtel.bxdatadxgzdg.dao.*;
import com.bxtel.exception.BusinessException;
import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import dinamica.*;
import dinamica.util.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import javax.annotation.Resource;


@Service("BxDataDxGzDgTBO")
public class BxDataDxGzDgTBO 
{
	@Resource
	public BxDataDxGzDgTDAO dao;
	
	private static final Log logger = LogFactory.getLog(BxDataDxGzDgTBO.class);
	
	public BxDataDxGzDgT add(BxDataDxGzDgT model)  throws BusinessException  {
		try {
			return dao.add(model);
		} catch (Exception e) {
			e.printStackTrace();
			throw new  BusinessException(e);
		}
	}
	public int delete(BxDataDxGzDgT model)   throws BusinessException  {
		try {
			return dao.deleteByCoud(model);
		} catch (Exception e) {
			e.printStackTrace();
			throw new  BusinessException(e);
		}
	}
	
	public int update(BxDataDxGzDgT model)  throws BusinessException  {
		try {
			return dao.updateCoudByRowId(model);
		} catch (Exception e) {
			e.printStackTrace();
			throw new  BusinessException(e);
		}
	}
	
	public int updateByCoudAndWhere(BxDataDxGzDgT model,BxDataDxGzDgT wheremodel)  throws BusinessException  {
		try {
			return dao.updateByCoudAndWhere(model,wheremodel);
		} catch (Exception e) {
			e.printStackTrace();
			throw new  BusinessException(e);
		}
	}
	
	
	public List<BxDataDxGzDgT> getBxDataDxGzDgTListByCoud(BxDataDxGzDgT model)   throws BusinessException  {
		try {
			return dao.getBxDataDxGzDgTListByCoud(model);
		} catch (Exception e) {
			e.printStackTrace();
			throw new  BusinessException(e);
		}
	}
	
	
	public List<BxDataDxGzDgT> getBxDataDxGzDgTListByExact(BxDataDxGzDgT model)  throws BusinessException  {
		try {
			return dao.getBxDataDxGzDgTListByExact(model);
		} catch (Exception e) {
			e.printStackTrace();
			throw new  BusinessException(e);
		}
	}
	
	
	
	
	public BxDataDxGzDgT getBxDataDxGzDgTByCoud(BxDataDxGzDgT model)  throws BusinessException  {
		try {
			return dao.getBxDataDxGzDgTByCoud(model);
		} catch (Exception e) {
			e.printStackTrace();
			throw new  BusinessException(e);
		}
	}
	
	public BxDataDxGzDgT getBxDataDxGzDgTByExact(BxDataDxGzDgT model)  throws BusinessException  {
		try {
			return dao.getBxDataDxGzDgTByExact(model);
		} catch (Exception e) {
			e.printStackTrace();
			throw new  BusinessException(e);
		}
	}
	
	
	
	
	public List<Map<String, Object>> getListMapByCoud(BxDataDxGzDgT model)  throws BusinessException {
		try {
			return dao.getListMapByCoud(model);
		} catch (Exception e) {
			e.printStackTrace();
			throw new  BusinessException(e);
		}
	}
	
	
	public List<Map<String, Object>> getListMapByExact(BxDataDxGzDgT model)   throws BusinessException {
		try {
			return dao.getListMapByExact(model);
		} catch (Exception e) {
			e.printStackTrace();
			throw new  BusinessException(e);
		}
	}
	
	
	public ListAndTotalCount<BxDataDxGzDgT> getPageList(BxDataDxGzDgT model, int pageIndex,int rows)  throws BusinessException 
	{
		try {
		
			List<BxDataDxGzDgT> list = dao.getPageListByCound(model,pageIndex,rows);
			ListAndTotalCount<BxDataDxGzDgT> lst = new ListAndTotalCount<BxDataDxGzDgT>();
			if(list!=null&& list.size()>0)
			{
				lst.setTotal(list.get(0).getTotalCount());
				lst.setRows(list);
			}
			return lst;
		} catch (Exception e) {
			e.printStackTrace();
			throw new  BusinessException(e);
		}
	}
}