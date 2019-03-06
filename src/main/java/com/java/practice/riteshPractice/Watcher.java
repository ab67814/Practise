package com.ritesh.practice.riteshPractice;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.List;

public class Watcher {

	public static void main(String[] args) {

		// define a folder root
		Path myDir = Paths.get("D:/Testdata");

		try {
			WatchService watcher = myDir.getFileSystem().newWatchService();
			myDir.register(watcher, StandardWatchEventKinds.ENTRY_CREATE, StandardWatchEventKinds.ENTRY_DELETE,
					StandardWatchEventKinds.ENTRY_MODIFY);

			//WatchKey watckKey = watcher.take();
			System.out.println(":::>>>>>>");
			//while(true)
			for (;;) {
				WatchKey watckKey;
				 try {
					 watckKey = watcher.take();
				    } catch (InterruptedException x) {
				        return;
				    }
				 
				System.out.println("inside loop");

				List<WatchEvent<?>> events = watckKey.pollEvents();
				for (WatchEvent<?> event : events) {
					if (event.kind() == StandardWatchEventKinds.ENTRY_CREATE) {
						System.out.println("Created: " + event.context().toString());
					}
					if (event.kind() == StandardWatchEventKinds.ENTRY_DELETE) {
						System.out.println("Delete: " + event.context().toString());
					}
					if (event.kind() == StandardWatchEventKinds.ENTRY_MODIFY) {
						System.out.println("Modify: " + event.context().toString());
					}
				}
				watckKey.reset();
			}

		} catch (Exception e) {
			System.out.println("Error: " + e.toString());
		}
	}
}