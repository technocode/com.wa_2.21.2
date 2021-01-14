package X;

import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.SystemClock;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.RandomAccessFile;

/* renamed from: X.1g6  reason: invalid class name and case insensitive filesystem */
public class C33041g6 implements AnonymousClass104 {
    public MediaRecorder A00;
    public final AbstractC21160yH A01;
    public final boolean A02 = true;

    public C33041g6(AbstractC21160yH r2) {
        this.A01 = r2;
    }

    public final void A00(CamcorderProfile camcorderProfile, FileDescriptor fileDescriptor, int i, boolean z) {
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.A00 = mediaRecorder;
        AbstractC21160yH r3 = this.A01;
        r3.AK3(mediaRecorder);
        if (this.A02) {
            this.A00.setAudioSource(5);
            this.A00.setProfile(camcorderProfile);
        } else {
            this.A00.setOutputFormat(camcorderProfile.fileFormat);
            this.A00.setVideoFrameRate(camcorderProfile.videoFrameRate);
            this.A00.setVideoSize(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
            this.A00.setVideoEncodingBitRate(camcorderProfile.videoBitRate);
            this.A00.setVideoEncoder(camcorderProfile.videoCodec);
        }
        MediaRecorder mediaRecorder2 = this.A00;
        if (!z) {
            i = 0;
        }
        mediaRecorder2.setOrientationHint(i);
        this.A00.setOutputFile(fileDescriptor);
        this.A00.prepare();
        r3.AKL(this.A00);
        this.A00.start();
    }

    @Override // X.AnonymousClass104
    public C07050Vs AQ9(CamcorderProfile camcorderProfile, FileDescriptor fileDescriptor, AnonymousClass0VV r11, int i, boolean z, AnonymousClass101 r14, boolean z2) {
        A00(camcorderProfile, fileDescriptor, i, z);
        C07050Vs r7 = new C07050Vs(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, i, r11);
        if (r14 != null) {
            throw null;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = r7.A01;
        if (j != -1) {
            elapsedRealtime = j;
        }
        r7.A01 = elapsedRealtime;
        return r7;
    }

    @Override // X.AnonymousClass104
    public C07050Vs AQA(CamcorderProfile camcorderProfile, String str, AnonymousClass0VV r18, int i, boolean z, AnonymousClass101 r21, boolean z2) {
        A00(camcorderProfile, new RandomAccessFile(str, "rws").getFD(), i, z);
        C07050Vs r7 = new C07050Vs(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, str, i, r18, camcorderProfile.audioCodec, camcorderProfile.videoCodec);
        if (r21 != null) {
            throw null;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = r7.A01;
        if (j != -1) {
            elapsedRealtime = j;
        }
        r7.A01 = elapsedRealtime;
        return r7;
    }

    @Override // X.AnonymousClass104
    public void AQI() {
        try {
            MediaRecorder mediaRecorder = this.A00;
            if (mediaRecorder != null) {
                mediaRecorder.stop();
            }
            MediaRecorder mediaRecorder2 = this.A00;
            if (mediaRecorder2 != null) {
                mediaRecorder2.reset();
                this.A00.release();
                this.A00 = null;
            }
        } catch (RuntimeException e) {
            Log.e("SimpleVideoCapture", "stopVideoRecording", e);
            throw new RuntimeException(e);
        } catch (Throwable th) {
            MediaRecorder mediaRecorder3 = this.A00;
            if (mediaRecorder3 != null) {
                mediaRecorder3.reset();
                this.A00.release();
                this.A00 = null;
            }
            throw th;
        }
    }
}
