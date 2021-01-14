package X;

import com.facebook.msys.mci.network.common.DataTask;
import com.facebook.msys.mci.network.common.UrlResponse;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.3Vx  reason: invalid class name and case insensitive filesystem */
public final class C73213Vx extends AbstractRunnableC20910xi {
    public final /* synthetic */ DataTask A00;
    public final /* synthetic */ AnonymousClass04B A01;
    public final /* synthetic */ UrlResponse A02;
    public final /* synthetic */ File A03;
    public final /* synthetic */ IOException A04;
    public final /* synthetic */ byte[] A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73213Vx(DataTask dataTask, AnonymousClass04B r3, UrlResponse urlResponse, byte[] bArr, File file, IOException iOException) {
        super("markDataTaskCompleted");
        this.A00 = dataTask;
        this.A01 = r3;
        this.A02 = urlResponse;
        this.A05 = bArr;
        this.A03 = file;
        this.A04 = iOException;
    }

    public void run() {
        File file;
        String str;
        DataTask dataTask = this.A00;
        String str2 = dataTask.mTaskCategory;
        String str3 = dataTask.mTaskIdentifier;
        int i = dataTask.mTaskType;
        try {
            AnonymousClass04B r1 = this.A01;
            UrlResponse urlResponse = this.A02;
            byte[] bArr = this.A05;
            file = this.A03;
            if (file != null) {
                str = file.getCanonicalPath();
            } else {
                str = null;
            }
            r1.markDataTaskAsCompletedCallback(str2, str3, i, urlResponse, bArr, str, this.A04);
            if (file == null) {
                return;
            }
        } catch (IOException e) {
            Log.e("wa-msys/NetworkSession: IOException while executing markDataTaskCompleted", e);
            this.A01.markDataTaskAsCompletedCallback(str2, str3, i, this.A02, this.A05, null, e);
            file = this.A03;
            if (file == null) {
                return;
            }
        } catch (Throwable th) {
            File file2 = this.A03;
            if (file2 != null) {
                file2.delete();
            }
            throw th;
        }
        file.delete();
    }
}
