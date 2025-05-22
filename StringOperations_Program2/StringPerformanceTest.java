package program2b;

public class StringPerformanceTest {
	
	    public static void main(String[] args) {
	        int iterations = 10000;

	        // Test StringBuffer
	        long startBuffer = System.nanoTime();
	        StringBuffer stringBuffer = new StringBuffer();
	        for (int i = 0; i < iterations; i++) {
	            stringBuffer.append("AIET");
	        }
	        long endBuffer = System.nanoTime();
	        System.out.println("Time taken by StringBuffer: " + (endBuffer - startBuffer) + " ns");

	        // Test StringBuilder
	        long startBuilder = System.nanoTime();
	        StringBuilder stringBuilder = new StringBuilder();
	        for (int i = 0; i < iterations; i++) {
	            stringBuilder.append("AIET");
	        }
	        long endBuilder = System.nanoTime();
	        System.out.println("Time taken by StringBuilder: " + (endBuilder - startBuilder) + " ns");

	        // Justification
	        if ((endBuilder - startBuilder) < (endBuffer - startBuffer)) {
	            System.out.println("StringBuilder is faster and more efficient than StringBuffer for single-threaded operations.");
	        } else {
	            System.out.println("StringBuffer is better for thread-safe operations, but slower than StringBuilder.");
	        }
	    }
	}


