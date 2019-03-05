package com.pattern.structuretype.proxy;
/**
 * Description: 静态代理->被代理者实现
 *
 * @author zuogangju
 * @date 2019/3/4 15:44
 * @version V1.0
 */
public class Lawyer implements ILawsuit{
	/**
	 * 持有一个具体被代理者的引用
	 */
	private ILawsuit mLawsuit;
	
	public Lawyer(ILawsuit lawsuit) {
		this.mLawsuit = lawsuit;
	}

	@Override
	public void submit() {
		mLawsuit.submit();
	}

	@Override
	public void burden() {
		mLawsuit.burden();
	}

	@Override
	public void defend() {
		mLawsuit.defend();
	}

	@Override
	public void finish() {
		mLawsuit.finish();
	}

}
