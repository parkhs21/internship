/*
 * StockHistoryServer.java
 *
 * Created on April 22, 2007, 12:50 AM
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or (at
 * your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 * Copyright (C) 2007 Cheok YanCheng <yccheok@yahoo.com>
 */

package org.yccheok.jstock.engine;

/**
 *
 * @author yccheok
 */
public interface StockHistoryServer {
    public Stock getStock(long timestamp);
    public long getTimestamp(int index);
    public int size();
    
    // Currently, we didn't see the need for sharesIssued and marketCapital to
    // become the member variables of Stock. In order to avoid memory hungry
    // monster and difficulty in constructing Stock, we will move the
    // share issued and market capital information into here.
    //
    // Currently, I am still not sure whether this is a good idea. We need
    // to experiment it out.
    public long getSharesIssued();
    public long getMarketCapital();
}
