  package com.tnsif.day7;

public class Example1 {
		// TODO Auto-generated method stub
		private String name;
		private String address;
		private Long mob;
		public Example1()
		{
			System.out.println("this is Default constructor");
		}
		public Example1(String name,String address,Long mob)
		{
			this.name=name;
			this.address=address;
			this.mob=mob;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public Long getMob() {
			return mob;
		}
		public void setMob(Long mob) {
			this.mob = mob;
		}
		@Override
		public String toString() {
			return "Example1 [name=" + name + ", address=" + address + ", mob=" + mob + "]";
		}
		
		
}
    