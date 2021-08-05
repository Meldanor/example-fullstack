FROM gradle:7-jdk16
WORKDIR /app
COPY build.gradle settings.gradle ./
COPY src src
RUN gradle build -x test
# Wait for ever
CMD tail -f /dev/null
