package com.meuestudo.spring.study.xml;

public class XmlPersonDAO {

    private XmlJdbcConnection jdbcConnection;

    public void setJdbcConnection(XmlJdbcConnection jdbcConnection) {
        this.jdbcConnection = jdbcConnection;
    }

    public XmlJdbcConnection getJdbcConnection() {
        return jdbcConnection;
    }
}
