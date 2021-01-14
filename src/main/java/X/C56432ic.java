package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.2ic  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C56432ic implements AbstractC03150Ez {
    public final /* synthetic */ C40531tQ A00;
    public final /* synthetic */ C04420Kh A01;
    public final /* synthetic */ C56862jJ A02;

    public /* synthetic */ C56432ic(C04420Kh r1, C40531tQ r2, C56862jJ r3) {
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
    }

    @Override // X.AbstractC03150Ez
    public final void A1e(Object obj) {
        File file;
        C04420Kh r4 = this.A01;
        C40531tQ r9 = this.A00;
        C56862jJ r3 = this.A02;
        AnonymousClass1WE r11 = (AnonymousClass1WE) obj;
        StringBuilder A0S = AnonymousClass008.A0S("mediajobmanager/mediajob/moved for ");
        CopyOnWriteArrayList copyOnWriteArrayList = r9.A01;
        A0S.append(copyOnWriteArrayList.size());
        A0S.append(" messages: ");
        File file2 = r11.A01;
        A0S.append(file2);
        A0S.append("; job=");
        A0S.append(r3);
        Log.d(A0S.toString());
        C04430Ki r32 = r4.A08;
        synchronized (r9.A00()) {
            AnonymousClass0M4 r0 = r9.A00().A02;
            if (r0 != null) {
                file = r0.A0F;
            } else {
                throw null;
            }
        }
        int size = copyOnWriteArrayList.size();
        r11.A03.addAndGet(size);
        boolean z = false;
        if (file2.equals(file)) {
            r11.A02.set(true);
        } else if (size == 0) {
            Log.d("sendmediamessagemanager/applyMediaFileReference skip, uploadReason is empty");
        } else {
            StringBuilder sb = new StringBuilder("sendmediamessagemanager/applyMediaFileReference replace ");
            sb.append(size);
            sb.append(" refs: ");
            sb.append(file);
            sb.append(" -> ");
            sb.append(file2);
            Log.d(sb.toString());
            AnonymousClass0B3 r33 = r32.A01;
            boolean andSet = r11.A02.getAndSet(true);
            if (r33.A09(file2)) {
                r33.A07(file2, size, andSet);
            }
            for (AnonymousClass0M3 r2 : Collections.unmodifiableList(copyOnWriteArrayList)) {
                synchronized (r2) {
                    AnonymousClass0M4 r02 = r2.A02;
                    if (r02 != null) {
                        r02.A0F = file2;
                        r2.A01 = r11.A00;
                    } else {
                        throw null;
                    }
                }
            }
            if (file != null) {
                byte b = r9.A00().A0m;
                if (r33 != null) {
                    try {
                        AnonymousClass088 r1 = r33.A01;
                        if (!r1.A0L(file)) {
                            if (r1.A0K(file) && !r1.A0M(file)) {
                            }
                            r33.A05(file, b, z, size);
                            return;
                        }
                        z = true;
                    } catch (IOException e) {
                        Log.e("ReferenceCountedFileManager/isPrivateManagedMediaFile ", e);
                    }
                    r33.A05(file, b, z, size);
                    return;
                }
                throw null;
            }
        }
    }
}
