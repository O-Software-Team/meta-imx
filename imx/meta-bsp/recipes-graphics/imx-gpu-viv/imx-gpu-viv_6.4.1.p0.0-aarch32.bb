require imx-gpu-viv-v6.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3" 

# FIXME: Remove this patch when upstream handles backend-specific libGL
SRC_URI += "file://Add-dummy-libgl.patch"

SRC_URI[md5sum] = "23f14f8c1c6f965438169581af67c0c7"
SRC_URI[sha256sum] = "ef9908b53c620c04d9e56804530f57d384b9d86bc118937c1fda55f6400dcf26"

do_install_append() {
    if [ "${IS_MX6SL}" != "1" ]; then
        if [ "${USE_WL}" = "yes" -o "${USE_X11}" = "yes" ]; then
            cp ${S}/gpu-core/usr/lib/libGL-${backend}.so ${D}${libdir}/libGL.so.1.2.0
        fi
    fi
}

COMPATIBLE_MACHINE = "(mx6q|mx6dl|mx6sx|mx6sl|mx7ulp)"
