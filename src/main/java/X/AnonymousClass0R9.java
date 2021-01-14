package X;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.whatsapp.media.transcode.MediaTranscodeService;
import com.whatsapp.util.Log;
import java.util.HashMap;

/* renamed from: X.0R9  reason: invalid class name */
public final class AnonymousClass0R9 extends AnonymousClass019 {
    public boolean A00 = false;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass0C2 A02;

    public AnonymousClass0R9(Context context, AnonymousClass0C2 r3) {
        this.A01 = context;
        this.A02 = r3;
    }

    @Override // X.AnonymousClass019
    public void A00(AbstractC007503q r8, int i) {
        HashMap hashMap = MediaTranscodeService.A08;
        synchronized (hashMap) {
            byte b = r8.A0m;
            if (b == 3 || b == 13 || b == 9 || (b == 2 && r8.A04 != 1)) {
                if (r8.A08 == 1) {
                    C007303n r4 = r8.A0n;
                    if (!hashMap.containsKey(r4)) {
                        hashMap.put(r4, (AnonymousClass0M3) r8);
                        Context context = this.A01;
                        Intent action = new Intent(context, MediaTranscodeService.class).setAction("com.whatsapp.media.transcode.MediaTranscodeService.START");
                        if (!this.A02.A00) {
                            this.A00 = true;
                            C004302a.A06(context, action);
                            StringBuilder sb = new StringBuilder();
                            sb.append("MediaTranscodeService/start-service-foreground for message:");
                            sb.append(r4);
                            Log.i(sb.toString());
                        } else {
                            try {
                                context.startService(action);
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("MediaTranscodeService/start-service for message:");
                                sb2.append(r4);
                                Log.i(sb2.toString());
                            } catch (IllegalStateException unused) {
                                this.A00 = true;
                                C004302a.A06(context, action);
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("MediaTranscodeService/start-service-foreground for message:");
                                sb3.append(r4);
                                Log.i(sb3.toString());
                            }
                        }
                    }
                } else {
                    AnonymousClass0M3 r2 = (AnonymousClass0M3) hashMap.remove(r8.A0n);
                    if (r2 != null && hashMap.isEmpty()) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("MediaTranscodeService/stop-service for message:");
                        sb4.append(r2.A0n);
                        Log.i(sb4.toString());
                        if (Build.VERSION.SDK_INT < 26 || !this.A00) {
                            Context context2 = this.A01;
                            context2.stopService(new Intent(context2, MediaTranscodeService.class));
                        } else {
                            Context context3 = this.A01;
                            C004302a.A06(context3, new Intent(context3, MediaTranscodeService.class).setAction("com.whatsapp.media.transcode.MediaTranscodeService.STOP"));
                        }
                        this.A00 = false;
                    }
                }
            }
        }
    }
}
