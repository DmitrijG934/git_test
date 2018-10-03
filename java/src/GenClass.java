class GenClass<T> {
	private T obj;

	public GenClass(T obj) {
		this.obj = obj;
	}

	public void setObj(T obj) { this.obj = obj; }

	public void getObj() { return obj; }
}
