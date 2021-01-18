package gr.uom.restmarios;

import android.os.AsyncTask;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;

public abstract class AsyncTaskExecutor implements Executor {


    Queue<AsyncTask> queue;

    public void doWork(){
        while(true){
            AsyncTask currentTask = queue.peek();
            currentTask.executeOnExecutor(this);
            currentTask.notify();
        }
    }

}