package abstractFactory.factory

import abstractFactory.doors.Door
import abstractFactory.windows.Window

interface FurnitureFactory {
    fun createDoor(): Door
    fun createWindow(): Window
}