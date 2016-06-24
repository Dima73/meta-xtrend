KV = "4.4.8"
SRCDATE = "20160624"
GCC = "4.9.1"

require et-dvb-modules.inc

SRC_URI = "http://xtrendet.net/${MACHINE}-drivers-${KV}-${GCC}-${SRCDATE}.zip"

SRC_URI[md5sum] = "ff2b50b3adf4a75812ef5e46a8a0f1ac"
SRC_URI[sha256sum] = "b28ef8822611eed255cad9f6a8e25afcf53e8ebf0c33c1d4c779502480c891ad"

COMPATIBLE_MACHINE = "et8500"
