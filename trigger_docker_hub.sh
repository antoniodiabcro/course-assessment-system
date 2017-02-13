#!/bin/sh
echo "curling to ... https://registry.hub.docker.com/u/antoniodiabcro/course-assessment-system/trigger/8d279df5-f3d0-45a7-83a1-2a09ca0f06e6/"
curl -H "Content-Type: application/json" --data '{"build": true}' -X POST https://registry.hub.docker.com/u/antoniodiabcro/course-assessment-system/trigger/8d279df5-f3d0-45a7-83a1-2a09ca0f06e6/