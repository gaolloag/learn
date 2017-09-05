package com.gaolloag.base.dp;

public class Business implements IBusiness, IBusiness2{

	@Override
	public void doSomeThing2() {
		System.out.println("执行业务逻辑2");
	}

	@Override
	public boolean doSomeThing() {
		System.out.println("执行业务逻辑");
		return false;
	}

}
