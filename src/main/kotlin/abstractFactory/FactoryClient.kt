package abstractFactory

import abstractFactory.doors.Door
import abstractFactory.factory.FurnitureFactory
import abstractFactory.windows.Window

class FactoryClient(var factory: FurnitureFactory) {
    private val door: Door = factory.createDoor()
    private val window: Window = factory.createWindow()

    fun paint() {
        door.paint()
        window.paint()
    }
}