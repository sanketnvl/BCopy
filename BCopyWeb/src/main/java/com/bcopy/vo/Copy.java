package com.bcopy.vo;

import java.sql.Timestamp;

public class Copy {

	private int id;
	private String symbol;
	private String Series;
	private double open;
	private double high;
	private double low;
	private double close;
	private double last;
	private double preclose;
	private double tottrdqty;
	private double tottrdval;
	private Timestamp createdDate;
	private double totaltrade;
	private String isin;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getSeries() {
		return Series;
	}

	public void setSeries(String series) {
		Series = series;
	}

	public double getOpen() {
		return open;
	}

	public void setOpen(double open) {
		this.open = open;
	}

	public double getHigh() {
		return high;
	}

	public void setHigh(double high) {
		this.high = high;
	}

	public double getLow() {
		return low;
	}

	public void setLow(double low) {
		this.low = low;
	}

	public double getClose() {
		return close;
	}

	public void setClose(double close) {
		this.close = close;
	}

	public double getLast() {
		return last;
	}

	public void setLast(double last) {
		this.last = last;
	}

	public double getPreclose() {
		return preclose;
	}

	public void setPreclose(double preclose) {
		this.preclose = preclose;
	}

	public double getTottrdqty() {
		return tottrdqty;
	}

	public void setTottrdqty(double tottrdqty) {
		this.tottrdqty = tottrdqty;
	}

	public double getTottrdval() {
		return tottrdval;
	}

	public void setTottrdval(double tottrdval) {
		this.tottrdval = tottrdval;
	}

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public double getTotaltrade() {
		return totaltrade;
	}

	public void setTotaltrade(double totaltrade) {
		this.totaltrade = totaltrade;
	}

	public String getIsin() {
		return isin;
	}

	public void setIsin(String isin) {
		this.isin = isin;
	}

	@Override
	public String toString() {
		return "Copy [id=" + id + ", symbol=" + symbol + ", Series=" + Series + ", open=" + open + ", high=" + high
				+ ", low=" + low + ", close=" + close + ", last=" + last + ", preclose=" + preclose + ", tottrdqty="
				+ tottrdqty + ", tottrdval=" + tottrdval + ", createdDate=" + createdDate + ", totaltrade=" + totaltrade
				+ ", isin=" + isin + "]";
	}

}
