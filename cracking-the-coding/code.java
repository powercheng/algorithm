try{
	FileReader fr = new FileReader（“test");
} catch(FileNotFoundException e) {
	System.out.println(e.getMessage());
}	catch (ArithmeticException e) {
	e.printStackCall();
} catch (Exception e) {
	
}
finally {
	System.out.println("runs for sure")
}

ArrayList<T> queue = new ArrayList<>();
