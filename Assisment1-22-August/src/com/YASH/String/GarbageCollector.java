package com.YASH.String;

public class GarbageCollector 
{
	
		String st;

		public GarbageCollector(String st)
		{
			this.st = st;
		}

		@Override
		protected void finalize() throws Throwable {
			super.finalize();
			System.out.println(this.st + " collected");
		}

		public static void main(String[] args) {
			GarbageCollector gcc = new GarbageCollector("Yash");
			System.out.println("String=" + gcc.st.toString());
			gcc = null;
			System.gc();

		}

	}

