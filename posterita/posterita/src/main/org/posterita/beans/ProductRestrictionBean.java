/**
 *  Product: Posterita Web-Based POS and Adempiere Plugin
 *  Copyright (C) 2007  Posterita Ltd
 *  This file is part of POSterita
 *  
 *  POSterita is free software; you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation; either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License along
 *  with this program; if not, write to the Free Software Foundation, Inc.,
 *  51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 * Created on Aug 30, 2005 by praveen
 *
 */
package org.posterita.beans;

public class ProductRestrictionBean extends StockBean
{    
    public Integer getProductCategoryId()
    {
        return productCategoryId;
    }
  
    public void setProductCategoryId(Integer productCategoryId)
    {
        this.productCategoryId = productCategoryId;
    } 
    
    public Integer[] getCheckBox()
    {
        return checkBox;
    }
    public Integer getColour() 
    {
        return colour;
    }
    
    public Integer getModel() 
    {
        return model;
    }
    
    public Integer getOrgId() 
    {
        return orgId;
    }
    
    public Integer getTransmission() 
    {
        return transmission;
    }
    
    public Integer getYear() 
    {
        return year;
    }
    
    public void setCheckBox(Integer[] checkBox) 
    {
        this.checkBox = checkBox;
    }
    
    public void setColour(Integer colour) 
    {
        this.colour = colour;
    }
    
    public void setModel(Integer model)
    {
        this.model = model;
    }
    
    public void setOrgId(Integer orgId)
    {
        this.orgId = orgId;
    } 
    
    public void setTransmission(Integer transmission) 
    {
        this.transmission = transmission;
    }
    
    public void setYear(Integer year) 
    {
        this.year = year;
    }
    
   
}