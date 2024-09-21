package la.devpicon.mobile.multiplatform.drawings

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform