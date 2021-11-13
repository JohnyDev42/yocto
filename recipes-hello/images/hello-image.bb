#inherit core-image
#IMAGE_INSTALL = "packagegroup-core-boot hello"
require recipes-core/images/core-image-minimal.bb
IMAGE_INSTALL += "hello"
