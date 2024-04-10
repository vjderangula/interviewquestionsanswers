package com.interviewquestionsanswers.signleton;

public class LazyDoubleLock
{
        // Java code to explain double-check locking private instance so that it can be
        // accessed by only by getInstance() method
        private static LazyDoubleLock instance;
        public String string;

        private LazyDoubleLock()
        {
                // private constructor
                string = "Welcome to Sreenu's Java Tutorial";
        }
        public static LazyDoubleLock getInstance()
        {
                if (instance == null)
                {
                        //synchronized block to remove overhead
                        synchronized (LazyDoubleLock.class)
                        {
                                if(instance==null)
                                {
                                        // if instance is null, initialize
                                        instance = new LazyDoubleLock();
                                }
                        }
                }
                return instance;
        }
        public static void main(String args[ ])
        {
                LazyDoubleLock text = LazyDoubleLock.getInstance();
                //original string
                System.out.println("Original String:");
                System.out.println(text.string);

                //text in upper case
                System.out.println("String in Upper Case:");
                text.string = (text.string).toUpperCase();
                System.out.println(text.string);

        }
}