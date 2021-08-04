FROM gradle:7-jdk16
WORKDIR /app
COPY build.gradle settings.gradle ./
RUN gradle compileJava
ADD src/ .
# Wait for ever
CMD tail -f /dev/null
