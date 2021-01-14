package X;

import android.os.ConditionVariable;
import java.util.LinkedList;
import java.util.ListIterator;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.0Nk  reason: invalid class name and case insensitive filesystem */
public class C05160Nk extends Thread {
    public final ConditionVariable A00 = new ConditionVariable(true);
    public final /* synthetic */ C05150Nj A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C05160Nk(C05150Nj r3) {
        super("ReadyJobsProducer");
        this.A01 = r3;
    }

    public void run() {
        Job job;
        boolean z;
        while (true) {
            ConditionVariable conditionVariable = this.A00;
            conditionVariable.block();
            conditionVariable.close();
            C05150Nj r4 = this.A01;
            synchronized (r4) {
                LinkedList linkedList = r4.A00;
                job = null;
                z = false;
                if (!linkedList.isEmpty()) {
                    ListIterator listIterator = linkedList.listIterator();
                    while (true) {
                        if (!listIterator.hasNext()) {
                            break;
                        }
                        Job job2 = (Job) listIterator.next();
                        String str = job2.parameters.groupId;
                        if ((str == null || !r4.A01.contains(str)) && job2.A04()) {
                            listIterator.remove();
                            String str2 = job2.parameters.groupId;
                            if (str2 != null) {
                                r4.A01.add(str2);
                            }
                            if (!r4.A02.offer(job2)) {
                                z = listIterator.hasNext();
                                job = job2;
                                break;
                            }
                        }
                    }
                }
            }
            if (job != null) {
                if (z) {
                    conditionVariable.open();
                }
                try {
                    r4.A02.put(job);
                } catch (InterruptedException unused) {
                }
            }
        }
    }
}
