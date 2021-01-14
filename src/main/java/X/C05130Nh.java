package X;

import java.io.IOException;
import java.io.NotSerializableException;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.0Nh  reason: invalid class name and case insensitive filesystem */
public class C05130Nh extends C05140Ni {
    public final AnonymousClass009 A00;

    public C05130Nh(AnonymousClass009 r1) {
        this.A00 = r1;
    }

    @Override // X.C05140Ni
    public String A00(Job job) {
        try {
            return super.A00(job);
        } catch (NotSerializableException e) {
            this.A00.A04("job-serialization-error", null, true);
            throw e;
        }
    }

    @Override // X.C05140Ni
    public Job A01(C68183Cb r3, boolean z, String str) {
        try {
            return super.A01(r3, z, str);
        } catch (RuntimeException e) {
            if (e.getCause() instanceof ClassNotFoundException) {
                throw new IOException(e);
            }
            throw e;
        }
    }
}
