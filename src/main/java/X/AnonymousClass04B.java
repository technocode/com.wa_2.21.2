package X;

import com.facebook.msys.mci.network.common.UrlResponse;
import java.io.IOException;

/* renamed from: X.04B  reason: invalid class name */
public interface AnonymousClass04B {
    void executeInNetworkContext(AbstractRunnableC20910xi v);

    void markDataTaskAsCompletedCallback(String str, String str2, int i, UrlResponse urlResponse, byte[] bArr, String str3, IOException iOException);

    void updateDataTaskDownloadProgressCallback(String str, long j, long j2, long j3);

    void updateDataTaskUploadProgressCallback(String str, long j, long j2, long j3);
}
