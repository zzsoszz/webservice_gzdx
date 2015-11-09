package com.bxtel.bxdatadxgzdg.controller;
import com.bxtel.bxdatadxgzdg.bo.*;
import com.bxtel.bxdatadxgzdg.model.*;

import com.bxtel.exception.BusinessException;
import dinamica.util.ListAndTotalCount;
import java.util.*;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


//com/bxtel/bxdatadxgzdg/controller/bxdatadxgzdgt/showadd.do
//com/bxtel/bxdatadxgzdg/controller/bxdatadxgzdgt/showdetail.do
//com/bxtel/bxdatadxgzdg/controller/bxdatadxgzdgt/showedit.do
//com/bxtel/bxdatadxgzdg/controller/bxdatadxgzdgt/showsearch.do
//com/bxtel/bxdatadxgzdg/controller/bxdatadxgzdgt/showpagelist.do
//com/bxtel/bxdatadxgzdg/controller/bxdatadxgzdgt/showlist.do
//com/bxtel/bxdatadxgzdg/controller/bxdatadxgzdgt/doadd.do
//com/bxtel/bxdatadxgzdg/controller/bxdatadxgzdgt/doupdate.do
//com/bxtel/bxdatadxgzdg/controller/bxdatadxgzdgt/dodelete.do


@Controller
public class BxDataDxGzDgTController extends MultiActionController {
	    
    @Resource
	public BxDataDxGzDgTBO  bo;
    
    private static final Log logger = LogFactory.getLog(BxDataDxGzDgTController.class);
    
    
    @RequestMapping
    public ModelAndView showadd(BxDataDxGzDgT model,HttpServletRequest request, 
            HttpServletResponse response)  throws Exception, BusinessException {
        ModelAndView mav = new ModelAndView();
		mav.addObject("model",model);
        return mav;
    }
    
    
    @RequestMapping
    public ModelAndView showdetail(BxDataDxGzDgT model,HttpServletRequest request, 
            HttpServletResponse response)  throws Exception, BusinessException {
        ModelAndView mav = null;
        BxDataDxGzDgT  model_result=bo.getBxDataDxGzDgTByCoud(model);
        if(model_result!=null)
    	{
    		 mav = new ModelAndView();
    		 mav.addObject("model",model);
    	}
    	else
		{
			 throw new Exception("");
		}
        return mav;
    }
    
    
    @RequestMapping
    public ModelAndView showedit(BxDataDxGzDgT model,HttpServletRequest request, 
            HttpServletResponse response)  throws Exception, BusinessException {
        ModelAndView mav = null;
        BxDataDxGzDgT  model_result=bo.getBxDataDxGzDgTByCoud(model);
        if(model_result!=null)
    	{
    		 mav = new ModelAndView();
    		 mav.addObject("model",model);
    	}
    	else
		{
			 throw new Exception("");
		}
        return mav;
    }
    
    
    @RequestMapping
    public ModelAndView showsearch(BxDataDxGzDgT model,HttpServletRequest request, 
            HttpServletResponse response)  throws Exception, BusinessException {
        ModelAndView mav = new ModelAndView();
		mav.addObject("model",model);
        return mav;
    }
   
    
    @RequestMapping
    public ModelAndView showlist(BxDataDxGzDgT model,int pageindex,int rows,HttpServletRequest request,HttpServletResponse response)  throws Exception, BusinessException {
    	ModelAndView mav=null;
		ListAndTotalCount<BxDataDxGzDgT>  modellist=bo.getPageList(model,pageindex,rows);
		if(Integer.parseInt(modellist.getTotal())>0)
    	{
    		mav = new ModelAndView();
   		 	mav.addObject("modellist",modellist);
    	}
		else
		{
			 throw new Exception("");
		}
        return mav;
    }
    
    @RequestMapping
    public ModelAndView listdata(BxDataDxGzDgT model,int pageindex,int rows,HttpServletRequest request,HttpServletResponse response)  throws Exception, BusinessException {
    	ModelAndView mav=null;
		ListAndTotalCount<BxDataDxGzDgT>  modellist=bo.getPageList(model,pageindex,rows);
		if(Integer.parseInt(modellist.getTotal())>0)
    	{
    		mav = new ModelAndView();
   		 	mav.addObject("modellist",modellist);
    	}
		else
		{
			 throw new Exception("");
		}
        return mav;
    }
    
    
    @RequestMapping
    public ModelAndView doadd(BxDataDxGzDgT model,HttpServletRequest request, HttpServletResponse response)  throws Exception, BusinessException {
    	ModelAndView mav=null;
    	if(bo.add(model)!=null)
    	{
    		 mav = new ModelAndView("showdetail");
    		 mav.addObject("model",model);
    	}
    	else
		{
			 throw new Exception("");
		}
        return mav;
    }
    
    @RequestMapping
    public ModelAndView dodelete(BxDataDxGzDgT model,HttpServletRequest request, HttpServletResponse response)  throws Exception, BusinessException {
       	ModelAndView mav=null;
       	if(bo.delete(model)>0)
    	{
    		 mav = new ModelAndView("forward:showsearch");
    		 mav.addObject("model",model);
    	}
    	else
		{
			 throw new Exception("");
		}
        return mav;
    }
    
    
    @RequestMapping
    public ModelAndView doupdate(BxDataDxGzDgT model,HttpServletRequest request, HttpServletResponse response) throws Exception, BusinessException{
	    ModelAndView mav=null;
    	if(bo.update(model)>0)
    	{
    		 mav = new ModelAndView("forward:showedit");
    		 mav.addObject("model",model);
    	}
    	else
		{
			 throw new Exception("");
		}
        return mav;
    }
    
}