/*
 * JStock - Free Stock Market Software
 * Copyright (C) 2015 Yan Cheng Cheok <yccheok@yahoo.com>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package org.yccheok.jstock.engine;

/**
 *
 * @author yccheok
 */
public class Symbol {
    private Symbol(String symbol) {
        this.symbol = symbol;
    }
    
    public static Symbol newInstance(String symbol) {
        if (symbol == null) {
            throw new java.lang.IllegalArgumentException("symbol cannot be null");
        }
        
        return new Symbol(symbol);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + symbol.hashCode();
        
        return result;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;

        if (!(o instanceof Symbol))
            return false;
        
        return this.symbol.equals(((Symbol)o).symbol);
    }
    
    @Override
    public String toString() {
        return symbol;
    }
    
    private final String symbol;
}
