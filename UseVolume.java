class UseVolume
{
	public static void main(String ar[])
	{
		Volume v1,v2,v3,v4,v5;
		v1=new Volume();
		v2=new Volume();
		v3=new Volume();
		v4=new Volume();
		v5=new Volume();
		v1.set(4,5,6);
		v2.set();
		v3.set(5);
		v4.set(4,5);
		v1.show();
		v2.show();
		v3.show();
		v4.show();
		//int i=v1.vol();
		//System.out.println(i);
	}
}