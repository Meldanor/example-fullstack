FROM gradle:7-jdk16
WORKDIR /app
COPY build.gradle settings.gradle ./
ADD src/ .
RUN gradle build
# Wait for ever
CMD tail -f /dev/null
