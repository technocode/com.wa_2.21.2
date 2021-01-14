package com.whatsapp.voipcalling.camera;

import X.AnonymousClass008;
import X.AnonymousClass00E;
import X.AnonymousClass00G;
import X.AnonymousClass3A5;
import X.AnonymousClass3A6;
import X.AnonymousClass3AE;
import X.AnonymousClass3AF;
import X.AnonymousClass3AG;
import X.C09270cb;
import X.C72733Ua;
import X.C74393an;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.hardware.Camera;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.SparseArray;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.pjsip.PjCamera;

public final class VoipCameraManager {
    public static volatile VoipCameraManager INSTANCE;
    public final AnonymousClass3AE cameraEventsListener = new C74393an(this);
    public volatile int currentApiVersion = 1;
    public volatile VoipPhysicalCamera currentCamera;
    public volatile Point lastAdjustedCameraPreviewSize;
    public final SparseArray rawCameraInfoCache = new SparseArray();
    public final C09270cb voipSharedPreferences;
    public final AnonymousClass00G waContext;

    public VoipCameraManager(AnonymousClass00G r4, C09270cb r5) {
        this.waContext = r4;
        this.voipSharedPreferences = r5;
        String A03 = r5.A03();
        if (Build.VERSION.SDK_INT >= 21 && !TextUtils.isEmpty(A03) && C72733Ua.A00(A03, getCachedCam2HardwareLevel())) {
            this.currentApiVersion = 2;
        }
    }

    public void addCameraErrorListener(AnonymousClass3AE r2) {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera != null) {
            voipPhysicalCamera.addCameraEventsListener(r2);
        }
    }

    public static void clearStoredRawCameraInfo(VoipCameraManager voipCameraManager, int i, int i2) {
        voipCameraManager.voipSharedPreferences.A00.edit().remove(C09270cb.A01(i, i2)).apply();
    }

    public static synchronized void closeCurrentCamera(VoipCameraManager voipCameraManager, VoipPhysicalCamera voipPhysicalCamera) {
        synchronized (voipCameraManager) {
            VoipPhysicalCamera voipPhysicalCamera2 = voipCameraManager.currentCamera;
            boolean z = false;
            if (voipPhysicalCamera2 == voipPhysicalCamera) {
                z = true;
            }
            AnonymousClass00E.A08(z, "attempted to close orphaned camera");
            if (!(voipPhysicalCamera2 == null || voipPhysicalCamera2 == voipPhysicalCamera)) {
                voipPhysicalCamera2.removeCameraEventsListener(voipCameraManager.cameraEventsListener);
                voipPhysicalCamera2.close(true);
            }
            voipPhysicalCamera.removeCameraEventsListener(voipCameraManager.cameraEventsListener);
            voipCameraManager.lastAdjustedCameraPreviewSize = voipPhysicalCamera.getAdjustedPreviewSize();
            voipCameraManager.currentCamera = null;
        }
    }

    public synchronized VoipCamera createCamera(int i, int i2, int i3, int i4, int i5, long j) {
        VoipPhysicalCamera r4;
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        VoipPhysicalCamera voipPhysicalCamera2 = null;
        if (voipPhysicalCamera != null) {
            AnonymousClass3AF cameraInfo = voipPhysicalCamera.getCameraInfo();
            if (cameraInfo.A05 != i2 || cameraInfo.A02 != i3 || cameraInfo.A00 != i4 || cameraInfo.A03 != i) {
                return null;
            }
            return new VoipCamera(voipPhysicalCamera, j);
        }
        try {
            AnonymousClass3A5 rawCameraInfo = getRawCameraInfo(i);
            if (rawCameraInfo != null) {
                if (rawCameraInfo.A00 == 1) {
                    r4 = new PjCamera(i, i2, i3, i4, i5, j);
                    r4.passiveMode = this.voipSharedPreferences.A00.getBoolean("force_passive_capture_dev_stream_role", false);
                } else {
                    r4 = new C72733Ua(i, i2, i3, i4, i5);
                    r4.passiveMode = false;
                }
                r4.addCameraEventsListener(this.cameraEventsListener);
                voipPhysicalCamera2 = r4;
            } else {
                Log.e("voip/VoipCameraManager/createCamera couldn't get camera info");
            }
            this.currentCamera = voipPhysicalCamera2;
            return new VoipCamera(this.currentCamera, j);
        } catch (RuntimeException e) {
            Log.e("voip/VoipCameraManager/createCamera error while starting camera", e);
            return null;
        }
    }

    public Point getAdjustedCameraPreviewSize() {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera != null) {
            return voipPhysicalCamera.getAdjustedPreviewSize();
        }
        return null;
    }

    public int getCachedCam2HardwareLevel() {
        int i = -1;
        int i2 = this.voipSharedPreferences.A00.getInt("lowest_camera_hardware_support_level", -1);
        if (i2 == -1) {
            CameraManager cameraManager = (CameraManager) this.waContext.A00.getSystemService("camera");
            if (cameraManager == null) {
                Log.e("voip/video/VoipCamera/getLowestCam2HardwareLevel CameraManager is null");
            } else {
                int[] iArr = C72733Ua.A0G;
                int length = iArr.length;
                try {
                    if (cameraManager.getCameraIdList().length > 0) {
                        for (String str : cameraManager.getCameraIdList()) {
                            Integer num = (Integer) cameraManager.getCameraCharacteristics(str).get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                            if (num != null) {
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= length) {
                                        break;
                                    } else if (num.intValue() == iArr[i3]) {
                                        length = i3;
                                        break;
                                    } else {
                                        i3++;
                                    }
                                }
                            }
                        }
                    }
                    if (length < length) {
                        i = iArr[length];
                    }
                } catch (Exception e) {
                    Log.e("voip/video/VoipCamera/getLowestCam2HardwareLevel unable to acquire camera info", e);
                } catch (AssertionError e2) {
                    Log.e("voip/video/VoipCamera/getLowestCam2HardwareLevel unable to acquire camera info", e2);
                }
            }
            this.voipSharedPreferences.A00.edit().putInt("lowest_camera_hardware_support_level", i).apply();
            i2 = i;
        }
        AnonymousClass008.A0v("voip/VoipCameraManager/getCachedCam2HardwareLevel got:", i2);
        return i2;
    }

    public synchronized int getCameraCount() {
        if (this.currentApiVersion == 1) {
            return Camera.getNumberOfCameras();
        } else if (Build.VERSION.SDK_INT < 21 || this.currentApiVersion != 2) {
            return 0;
        } else {
            CameraManager cameraManager = (CameraManager) this.waContext.A00.getSystemService("camera");
            if (cameraManager == null) {
                Log.w("voip/VoipCameraManager/getCameraCount, unable to acquire camera manager");
                return 0;
            }
            try {
                return cameraManager.getCameraIdList().length;
            } catch (Exception unused) {
                Log.w("voip/VoipCameraManager/getCameraCount, unable to connect to cameras!");
                return 0;
            }
        }
    }

    private int getCameraInfoCacheKey(int i, int i2) {
        int i3 = i + i2;
        return (((i3 + 1) * i3) >> 1) + i2;
    }

    public int getCameraStartMode() {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera != null) {
            return voipPhysicalCamera.getCameraStartMode();
        }
        return -1;
    }

    public int getCurrentApiVersion() {
        return this.currentApiVersion;
    }

    public static VoipCameraManager getInstance() {
        if (INSTANCE == null) {
            synchronized (VoipCameraManager.class) {
                if (INSTANCE == null) {
                    INSTANCE = new VoipCameraManager(AnonymousClass00G.A01, C09270cb.A00());
                }
            }
        }
        return INSTANCE;
    }

    public Point getLastAdjustedCameraPreviewSize() {
        return this.lastAdjustedCameraPreviewSize;
    }

    public AnonymousClass3AG getLastCachedFrame() {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera != null) {
            return voipPhysicalCamera.getLastCachedFrame();
        }
        return null;
    }

    public synchronized AnonymousClass3A5 getRawCameraInfo(int i) {
        AnonymousClass3A5 r14;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        AnonymousClass3A6 r7;
        ArrayList arrayList;
        JSONArray jSONArray3;
        StringBuilder sb = new StringBuilder();
        sb.append("voip/VoipCameraManager/getRawCameraInfo camera: ");
        sb.append(i);
        sb.append(" enabled camera version: ");
        sb.append(this.currentApiVersion);
        Log.i(sb.toString());
        SparseArray sparseArray = this.rawCameraInfoCache;
        int i2 = this.currentApiVersion;
        int i3 = i + i2;
        r14 = (AnonymousClass3A5) sparseArray.get((((i3 + 1) * i3) >> 1) + i2);
        if (r14 == null) {
            C09270cb r1 = this.voipSharedPreferences;
            int i4 = this.currentApiVersion;
            SharedPreferences sharedPreferences = r1.A00;
            String A01 = C09270cb.A01(i, i4);
            String str = null;
            String string = sharedPreferences.getString(A01, null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("voip/VoipCameraManager/getRawCameraInfo, stored info for camera ");
            sb2.append(i);
            sb2.append(": ");
            sb2.append(string);
            Log.i(sb2.toString());
            if (!TextUtils.isEmpty(string)) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    int i5 = jSONObject.getInt("version");
                    if (i5 != 1) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("voip/RawCameraInfo/createFromJson, skip mismatched json version ");
                        sb3.append(i5);
                        sb3.append(", required ");
                        sb3.append(1);
                        Log.i(sb3.toString());
                    } else {
                        int i6 = jSONObject.getInt("apiVersion");
                        if (i6 == 1 || i6 == 2) {
                            boolean z = jSONObject.getBoolean("isFrontCamera");
                            int i7 = jSONObject.getInt("orientation");
                            JSONArray jSONArray4 = jSONObject.getJSONArray("supportFormats");
                            if (jSONArray4 == null) {
                                Log.e("voip/RawCameraInfo/createFromJson, cannot find formats");
                            } else {
                                int[] iArr = new int[jSONArray4.length()];
                                for (int i8 = 0; i8 < jSONArray4.length(); i8++) {
                                    iArr[i8] = jSONArray4.getInt(i8);
                                }
                                if (!jSONObject.has("preferredSize") || (jSONArray3 = jSONObject.getJSONArray("preferredSize")) == null) {
                                    r7 = null;
                                } else if (jSONArray3.length() != 2) {
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append("voip/RawCameraInfo createFromJson bad preferred size ");
                                    sb4.append(jSONArray3);
                                    Log.e(sb4.toString());
                                } else {
                                    r7 = new AnonymousClass3A6(jSONArray3.getInt(0), jSONArray3.getInt(1));
                                }
                                if (jSONObject.has("previewSizes")) {
                                    JSONArray jSONArray5 = jSONObject.getJSONArray("previewSizes");
                                    if (jSONArray5 == null) {
                                        arrayList = null;
                                    } else {
                                        int length = jSONArray5.length();
                                        if (length % 2 == 0) {
                                            arrayList = new ArrayList(length / 2);
                                            for (int i9 = 0; i9 < length; i9 += 2) {
                                                arrayList.add(new AnonymousClass3A6(jSONArray5.getInt(i9), jSONArray5.getInt(i9 + 1)));
                                            }
                                        } else {
                                            throw new JSONException("length is not even");
                                        }
                                    }
                                } else {
                                    arrayList = null;
                                }
                                r14 = new AnonymousClass3A5(i6, z, i7, iArr, r7, arrayList);
                                if (!isRawCameraInfoValid(i, r14)) {
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append("voip/VoipCameraManager/getRawCameraInfo, stored raw info is outdated ");
                                    sb5.append(r14);
                                    Log.w(sb5.toString());
                                    clearStoredRawCameraInfo(this, i, r14.A00);
                                }
                                SparseArray sparseArray2 = this.rawCameraInfoCache;
                                int i10 = this.currentApiVersion;
                                int i11 = i + i10;
                                sparseArray2.put((((i11 + 1) * i11) >> 1) + i10, r14);
                            }
                        } else {
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("voip/RawCameraInfo/createFromJson, skip unsupported api version ");
                            sb6.append(i6);
                            Log.i(sb6.toString());
                        }
                    }
                } catch (JSONException e) {
                    Log.e(e);
                }
            }
            r14 = loadFromCameraService(i);
            if (r14 != null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("version", 1);
                    jSONObject2.put("apiVersion", r14.A00);
                    jSONObject2.put("isFrontCamera", r14.A04);
                    jSONObject2.put("orientation", r14.A01);
                    JSONArray jSONArray6 = new JSONArray();
                    for (int i12 : r14.A05) {
                        jSONArray6.put(i12);
                    }
                    jSONObject2.put("supportFormats", jSONArray6);
                    AnonymousClass3A6 r3 = r14.A02;
                    if (r3 != null) {
                        jSONArray = new JSONArray();
                        jSONArray.put(r3.A01);
                        jSONArray.put(r3.A00);
                    } else {
                        jSONArray = null;
                    }
                    jSONObject2.put("preferredSize", jSONArray);
                    List<AnonymousClass3A6> list = r14.A03;
                    if (list != null) {
                        jSONArray2 = new JSONArray();
                        for (AnonymousClass3A6 r2 : list) {
                            jSONArray2.put(r2.A01);
                            jSONArray2.put(r2.A00);
                        }
                    } else {
                        jSONArray2 = null;
                    }
                    jSONObject2.put("previewSizes", jSONArray2);
                    str = jSONObject2.toString();
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                if (!TextUtils.isEmpty(str)) {
                    this.voipSharedPreferences.A00.edit().putString(C09270cb.A01(i, r14.A00), str).apply();
                }
            } else {
                clearStoredRawCameraInfo(this, i, this.currentApiVersion);
            }
            SparseArray sparseArray22 = this.rawCameraInfoCache;
            int i102 = this.currentApiVersion;
            int i112 = i + i102;
            sparseArray22.put((((i112 + 1) * i112) >> 1) + i102, r14);
        }
        return r14;
    }

    public boolean isCameraTextureApiFailed() {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        return voipPhysicalCamera != null && voipPhysicalCamera.textureApiFailed;
    }

    private boolean isRawCameraInfoValid(int i, AnonymousClass3A5 r8) {
        int i2 = r8.A00;
        if (i2 == 1) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            try {
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.orientation == r8.A01 && cameraInfo.facing == r8.A04) {
                    return true;
                }
                return false;
            } catch (RuntimeException e) {
                Log.e(e);
                return false;
            }
        } else {
            if (i2 == 2) {
                try {
                    CameraManager cameraManager = (CameraManager) this.waContext.A00.getSystemService("camera");
                    if (cameraManager != null) {
                        CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(Integer.toString(i));
                        Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
                        Integer num2 = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                        if (num == null || num2 == null) {
                            Log.w("voip/VoipCameraManager/isRawCameraInfoValid metadata returned null values, invalidating cache");
                            return false;
                        } else if (r8.A01 != num.intValue()) {
                            return false;
                        } else {
                            boolean z = r8.A04;
                            boolean z2 = false;
                            if (num2.intValue() == 0) {
                                z2 = true;
                            }
                            if (z == z2) {
                                return true;
                            }
                            return false;
                        }
                    }
                } catch (Exception e2) {
                    Log.w("voip/VoipCameraManager/isRawCameraInfoValid, camera is unavailable, invalidating info", e2);
                }
            }
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x025b, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x025c, code lost:
        r0 = null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.AnonymousClass3A5 loadFromCameraService(int r19) {
        /*
        // Method dump skipped, instructions count: 622
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.voipcalling.camera.VoipCameraManager.loadFromCameraService(int):X.3A5");
    }

    public void removeCameraErrorListener(AnonymousClass3AE r2) {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera != null) {
            voipPhysicalCamera.removeCameraEventsListener(r2);
        }
    }

    public void setRequestedCamera2SupportLevel(String str) {
        int i = this.currentApiVersion;
        int i2 = 1;
        if (Build.VERSION.SDK_INT < 21) {
            this.currentApiVersion = 1;
        } else if (str == null) {
            this.currentApiVersion = 1;
        } else {
            if (C72733Ua.A00(str, getCachedCam2HardwareLevel())) {
                i2 = 2;
            }
            this.currentApiVersion = i2;
        }
        if (i != this.currentApiVersion) {
            Voip.refreshVideoDevice();
        }
    }

    public void updateCameraPreviewOrientation() {
        VoipPhysicalCamera voipPhysicalCamera = this.currentCamera;
        if (voipPhysicalCamera != null) {
            voipPhysicalCamera.updatePreviewOrientation();
        }
    }
}
