package noisethreader.handlers;

import java.util.concurrent.ForkJoinPool;

public abstract class ThreadHandler {
	
	private static ForkJoinPool commonPool;
	private static int threadSize = -1;

	public static ForkJoinPool getForkJoinPool() {
		if(commonPool == null) {
			commonPool = ForkJoinPool.commonPool();
		}
		return commonPool;
	}
	
	public static int getPoolSize() {
		if(threadSize == -1) {
			threadSize = getForkJoinPool().getParallelism();
		}
		return threadSize;
	}
}