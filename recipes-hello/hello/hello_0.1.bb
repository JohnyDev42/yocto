SUMMARY = "Hello bitbake-layers recipe"
DESCRIPTION = "Hello Recipe created by bitbake-layers"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

python do_display_banner() {
    bb.plain("***********************************************");
    bb.plain("*                                             *");
    bb.plain("*  Example recipe created by bitbake-layers   *");
    bb.plain("*                                             *");
    bb.plain("***********************************************");
}
SRC_URI = "file://hello.c"

S = "${WORKDIR}"
do_compile(){
	${CC} ${LDFLAGS} hello.c -o hello
}

do_install(){
	install -d ${D}${bindir}
	install -m 0755 hello ${D}${bindir}
}

addtask display_banner before do_build
