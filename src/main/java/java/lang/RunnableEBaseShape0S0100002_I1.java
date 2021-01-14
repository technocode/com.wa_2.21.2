package java.lang;

import X.AnonymousClass0YW;
import X.AnonymousClass2Ds;
import X.AnonymousClass2E3;
import X.AnonymousClass2WY;
import X.SurfaceHolder$CallbackC50852Wi;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import com.google.android.search.verification.client.R;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

public class RunnableEBaseShape0S0100002_I1 extends RunnableEmptyBase implements Runnable {
    public float A00;
    public float A01;
    public Object A02;
    public final int A03;

    public RunnableEBaseShape0S0100002_I1(Object obj, float f, float f2, int i) {
        this.A03 = i;
        this.A02 = obj;
        this.A00 = f;
        this.A01 = f2;
    }

    public final void run() {
        switch (this.A03) {
            case 0:
                float f = this.A00;
                float f2 = this.A01;
                AnonymousClass0YW r2 = ((AnonymousClass2WY) this.A02).A01;
                AnonymousClass2E3 r6 = r2.A0M;
                float left = ((float) r2.A07.getLeft()) + f;
                float top = ((float) r2.A07.getTop()) + f2;
                float f3 = r6.A00 / 2.0f;
                r6.A01 = new RectF(left - f3, top - f3, left + f3, f3 + top);
                r6.A02 = null;
                r6.setVisibility(0);
                r6.invalidate();
                r6.removeCallbacks(r6.A04);
                return;
            case 1:
                SurfaceHolder$CallbackC50852Wi r4 = (SurfaceHolder$CallbackC50852Wi) this.A02;
                float f4 = this.A00;
                float f5 = this.A01;
                synchronized (r4) {
                    Camera camera = r4.A07;
                    if (camera != null && r4.A0L) {
                        camera.cancelAutoFocus();
                        Camera.Parameters parameters = r4.A07.getParameters();
                        int maxNumFocusAreas = parameters.getMaxNumFocusAreas();
                        StringBuilder sb = new StringBuilder();
                        sb.append("cameraview/max-focus-areas  ");
                        sb.append(maxNumFocusAreas);
                        Log.d(sb.toString());
                        if (maxNumFocusAreas > 0) {
                            float dimension = r4.getContext().getResources().getDimension(R.dimen.autofocus_box_size);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("cameraview/focus-area-size:");
                            sb2.append(dimension);
                            Log.d(sb2.toString());
                            float f6 = dimension / 2.0f;
                            RectF rectF = new RectF(f4 - f6, f5 - f6, f4 + f6, f6 + f5);
                            Matrix matrix = new Matrix();
                            float f7 = 1.0f;
                            if (r4.A0M) {
                                f7 = -1.0f;
                            }
                            matrix.setScale(f7, 1.0f);
                            matrix.postRotate((float) r4.A01);
                            float width = (float) r4.getWidth();
                            float height = (float) r4.getHeight();
                            matrix.postScale(width / 2000.0f, height / 2000.0f);
                            matrix.postTranslate(width / 2.0f, height / 2.0f);
                            matrix.invert(matrix);
                            matrix.mapRect(rectF);
                            Rect rect = new Rect();
                            int A002 = SurfaceHolder$CallbackC50852Wi.A00(rectF.left);
                            rect.left = A002;
                            int A003 = SurfaceHolder$CallbackC50852Wi.A00(rectF.top);
                            rect.top = A003;
                            int i = A003;
                            int A004 = SurfaceHolder$CallbackC50852Wi.A00(rectF.right);
                            rect.right = A004;
                            int i2 = A004;
                            int A005 = SurfaceHolder$CallbackC50852Wi.A00(rectF.bottom);
                            rect.bottom = A005;
                            int i3 = A005;
                            if (Math.abs(A003 - A005) < 10) {
                                i = A003 - 5;
                                rect.top = i;
                                i3 = A005 + 5;
                                rect.bottom = i3;
                            }
                            if (Math.abs(A002 - A004) < 10) {
                                A002 -= 5;
                                rect.left = A002;
                                i2 = A004 + 5;
                                rect.right = i2;
                            }
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("cameraview/focus-area  ");
                            sb3.append(A002);
                            sb3.append(",");
                            sb3.append(i);
                            sb3.append(" - ");
                            sb3.append(i2);
                            sb3.append(",");
                            sb3.append(i3);
                            Log.d(sb3.toString());
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(new Camera.Area(rect, SearchActionVerificationClientService.CONNECTION_TIMEOUT_IN_MS));
                            parameters.setFocusAreas(arrayList);
                            List<String> supportedFocusModes = parameters.getSupportedFocusModes();
                            if (supportedFocusModes != null && supportedFocusModes.contains("auto")) {
                                parameters.setFocusMode("auto");
                            }
                            r4.A07.setParameters(parameters);
                            AnonymousClass2WY r3 = (AnonymousClass2WY) r4.A0H;
                            r3.A01.A0s.A02.post(new RunnableEBaseShape0S0100002_I1(r3, f4, f5, 0));
                        }
                        r4.A07.autoFocus(new AnonymousClass2Ds(r4));
                        return;
                    }
                    return;
                }
            default:
                return;
        }
    }
}
