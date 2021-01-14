package com.whatsapp.voipcalling.camera;

import com.whatsapp.voipcalling.VideoPort;
import java.nio.ByteBuffer;

public final class VoipCamera {
    public static final String TAG = "voip/video/VoipCamera/";
    public final VoipPhysicalCamera physicalCamera;
    public boolean started = false;
    public final long userIdentity;

    private final native void pushFrame(byte[] bArr, int i, long j);

    private final native void pushFramePlane(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, long j);

    public VoipCamera(VoipPhysicalCamera voipPhysicalCamera, long j) {
        this.physicalCamera = voipPhysicalCamera;
        this.userIdentity = j;
        voipPhysicalCamera.registerVirtualCamera(this);
    }

    public final synchronized void close() {
        this.physicalCamera.unregisterVirtualCamera(this);
        this.physicalCamera.close(false);
    }

    public final void frameCallback(byte[] bArr, int i) {
        pushFrame(bArr, i, this.userIdentity);
    }

    public final void framePlaneCallback(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4) {
        pushFramePlane(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, i4, this.userIdentity);
    }

    public final int getAverageCaptureFps() {
        return this.physicalCamera.getAverageCaptureFps();
    }

    public int getLatestFrame(ByteBuffer byteBuffer) {
        return this.physicalCamera.getLatestFrame(byteBuffer);
    }

    public final boolean getStarted() {
        return this.started;
    }

    public long getUserIdentity() {
        return this.userIdentity;
    }

    public final boolean isPassiveMode() {
        return this.physicalCamera.passiveMode;
    }

    public final synchronized int setVideoPort(VideoPort videoPort) {
        return this.physicalCamera.setVideoPort(videoPort);
    }

    public final synchronized int start() {
        this.started = true;
        return this.physicalCamera.start();
    }

    public final synchronized void stop() {
        this.started = false;
        this.physicalCamera.stop();
    }
}
