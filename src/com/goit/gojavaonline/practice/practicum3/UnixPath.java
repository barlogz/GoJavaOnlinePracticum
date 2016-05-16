package com.goit.gojavaonline.practice.practicum3;

import java.util.Deque;
import java.util.LinkedList;

public class UnixPath {
    public String simplify(String input) {
        Deque<String> clippedPath = new LinkedList<>();

        StringBuilder pathBuilder = new StringBuilder();

        String point = ".";
        String twoPoints = "..";

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) == '/' && pathBuilder.length() > 0) {
                if (point.equals(pathBuilder.toString())) {
                    pathBuilder.delete(0, pathBuilder.length());
                    continue;
                } else if (twoPoints.equals(pathBuilder.toString())) {
                    clippedPath.pollFirst();
                } else {
                    clippedPath.push(pathBuilder.toString());
                }
                pathBuilder.delete(0, pathBuilder.length());
            } else if (input.charAt(i) != '/') {
                pathBuilder.append(input.charAt(i));
            }
        }

        if (pathBuilder.length() > 0) {
            if (twoPoints.equals(pathBuilder.toString())) {
                clippedPath.pollFirst();
            } else if (point.equals(pathBuilder.toString())) {
                pathBuilder.delete(0, pathBuilder.length());
            } else {
                clippedPath.push(pathBuilder.toString());
            }
        }
        return convertDequeToString(clippedPath);
    }

    public String convertDequeToString(Deque<String> clippedPath) {
        StringBuilder path = new StringBuilder("/");
        if (clippedPath.isEmpty()) {
            return "/";
        } else {
            while (!clippedPath.isEmpty()) {
                path.append(clippedPath.pollLast());
                if (clippedPath.size() > 0) {
                    path.append("/");
                }
            }
        }
        return path.toString();
    }
}
