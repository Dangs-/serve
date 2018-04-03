module serve.core {
	requires java.base;
    requires junit;
	requires spring.beans;
	requires spring.core;
	requires spring.context;
	requires spring.tx;
	requires spring.data.commons;
	requires spring.data.jpa;
	requires spring.boot;
	requires spring.boot.autoconfigure;
    requires spring.test;
    requires spring.boot.test;
	requires commons.collections4;
	requires jackson.annotations;
	requires org.apache.commons.lang3;
	requires javax.transaction.api;
	requires hibernate.jpa;
}